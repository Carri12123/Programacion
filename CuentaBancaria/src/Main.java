
public class Main {

	public static void main(String[] args) {
		CuentaBancaria miCuenta = new CuentaBancaria("123456789", 1000.0);
		miCuenta.mostrarCuenta();
		
		miCuenta.ingresarDinero(500.0);
		miCuenta.mostrarCuenta();
		
		miCuenta.extraerDinero(2000);
		miCuenta.mostrarCuenta();
		
		miCuenta.extraerDinero(500.0);
		miCuenta.mostrarCuenta();
	}

}
