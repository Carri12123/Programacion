
public class CuentaBancaria {
	private String numeroCuenta;
	private double saldo;
	
	public CuentaBancaria(String numeroCuenta, double saldo){
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	public void ingresarDinero(double cantidad) {
		saldo += cantidad;
		
	}
	
	public void extraerDinero(double cantidad) {
		if((saldo - cantidad) < 0) {
			throw new java.lang.ArithmeticException ("Saldo");
		}else {
			saldo -= cantidad;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	
	public void mostrarCuenta() {
		System.out.println("Número de cuenta: " + numeroCuenta);
		System.out.println("Saldo actual : €" + saldo);
	}
	
	
}
