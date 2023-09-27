package clearminds.cuentas.test;

import clearminds.cuentas.Cuentas;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo objeto cuenta y lo referencio con cuenta1
		Cuentas cuenta1 = new Cuentas("03476");
		
		//Colocar un valor de saldo en cuenta 1
		cuenta1.setSaldo(675);
		
		//Creo objeto cuenta referencio cuenta2
		Cuentas cuenta2 = new Cuentas("03476", "C", 98);
		
		//Creo objeto cuenta referencio cuenta3
		Cuentas cuenta3 = new Cuentas("03476");
		
		//Modifico el tipo de cuenta
		cuenta3.setTipo("C");
		
		//Creo objeto cuenta referencio cuenta4
		Cuentas cuenta4 = new Cuentas("0987");
		cuenta4.setSaldo(10);
		
		//Creo objeto cuenta referencio cuenta5
		Cuentas cuenta5 = new Cuentas("0557", "C", 10);
		
		//Creo objeto cuenta referencio cuenta6
		Cuentas cuenta6 = new Cuentas("0666");

		
		//Imprimo cuenta1, cuenta2 y cuenta3
		System.out.println("-----------Valores Iniciales-----------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		System.out.println("-----------Valores MOdificados-----------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		//Imprimo cuenta4, cuenta6 y cuenta6
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		
		
	}

}
