package clearminds.cuentas;

public class Cuentas {
	private String id;
	private String tipo;
	private float saldo;

	// Constructores
	public Cuentas(String id) {
		this.id = id;
		this.tipo = "A";
	}

	public Cuentas(String id, String tipo, float saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	// Metodos
	public void imprimir() {
		System.out.println("*****************");
		System.out.println("CUENTA");
		System.out.println("*****************");
		System.out.println("Numero de cuenta:" +this.id);
		System.out.println("Tipo: " +this.tipo);
		System.out.println("Saldo: USD " +this.saldo);
		System.out.println("*****************");
	}
	
	public void imprimirConMiEstilo() {
		System.out.println("++++++++++++++++++");
		System.out.println("CUENTA");
		System.out.println("++++++++++++++++++");
		System.out.println("Numero de cuenta:" +this.id);
		System.out.println("Tipo: " +this.tipo);
		System.out.println("Saldo: USD " +this.saldo);
		System.out.println("++++++++++++++++++");
	}

	// getters y setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getId() {
		return id;
	}

}
