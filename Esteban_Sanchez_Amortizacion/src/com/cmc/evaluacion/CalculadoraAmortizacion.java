package com.cmc.evaluacion;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		Utilitario u = new Utilitario();
		double cuota = 0;
		double capital = prestamo.getMonto();
		double interes = (prestamo.getIntereses() / 12) / 100;
		int plazo = prestamo.getPlazo();
		cuota = (capital * interes) / (1 - (Math.pow((1 + interes), -plazo)));
		return u.redondear(cuota);

	}

	public static void generarTabla(Prestamo prestamo) {
		// double cuotaS = 0.0;
		for (int i = 1; i <= prestamo.getPlazo(); i++) {
			Cuota cuotaInicial = new Cuota(i);
			Cuota cuotaSiguiente = new Cuota(i);
			double cuota = calcularCuota(prestamo); // 1.Calcular cuota

			prestamo.getCuotas().add(cuotaInicial);
			cuotaInicial.setCuota(cuota);

			// si es la primera cuota mapeo el monto del prestamo en Inicio
			if (i == 1) {
				cuotaInicial.setInicio(prestamo.getMonto());

			} else {
				cuotaInicial.setInicio(prestamo.getCuotas().get(i - 2).getSaldo());
			}
			calcularValoresCuota(prestamo.getIntereses(), cuotaInicial, cuotaSiguiente);

			if (i == prestamo.getPlazo()) {
				//System.out.println(prestamo.getCuotas().get(i - 1).getSaldo());
				cuotaInicial.setAbonoCapital(
						prestamo.getCuotas().get(i - 1).getAbonoCapital() + prestamo.getCuotas().get(i - 1).getSaldo());
				cuotaInicial.setSaldo(prestamo.getCuotas().get(i - 1).getInicio()
						- prestamo.getCuotas().get(i - 1).getAbonoCapital());
			}
		}
	}

	private static void calcularValoresCuota(double interes, Cuota cuotaActual, Cuota cuotaSiguiente) {
		double valorInteres = cuotaActual.getInicio() * (interes / 12 / 100);
		double abonoCapital = cuotaActual.getCuota() - valorInteres;
		double saldo = cuotaActual.getInicio() - abonoCapital;

		cuotaActual.setInteres(valorInteres);
		cuotaActual.setAbonoCapital(abonoCapital);
		cuotaActual.setSaldo(saldo);
		cuotaActual.setCapital(cuotaActual.getInicio());

		if (cuotaSiguiente != null) {
			cuotaSiguiente.setInicio(saldo);
		} else {
			cuotaActual.setSaldo(0);
			cuotaActual.setAbonoCapital(cuotaActual.getInicio());
		}
	}

	public static void mostrarTabla(Prestamo prestamo) {
		Utilitario u = new Utilitario();
		Cuota cuota = new Cuota(0);
		System.out.println("Número    |    Cuota    |    Inicio    |    Interes    |    Abono    |    Saldo");
		for (int i = 0; i < prestamo.getPlazo(); i++) {
			cuota = prestamo.getCuotas().get(i);
			System.out.println(i + 1 + "         |    " + u.redondear(cuota.getCuota()) + "   |    "
					+ u.redondear(cuota.getCapital()) + "    |    " + u.redondear(cuota.getInteres()) + "       |    "
					+ u.redondear(cuota.getAbonoCapital()) + "   |   " + u.redondear(cuota.getSaldo()));
		}

	}
}
