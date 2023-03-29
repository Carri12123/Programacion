import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;


class CuentaBancariaTest {
	private CuentaBancaria cuenta;
	@BeforeAll
	public void nuevaCuenta() {
			cuenta = new CuentaBancaria("ES21099865462528660871295", 100);
	}
	@Test
	void testIngresarDinero() {
		cuenta.ingresarDinero(100);
		assertEquals(200, cuenta.getSaldo());
	}

	@Test
	void testExtraerDinero() {
		try{
			cuenta.extraerDinero(120);
			fail ("ERROR. Se debería haber lanzado una excepción al resultar un saldo negativo");
		}
		catch (ArithmeticException ae) {
			//Prueba correcta
		}
	}
	
	@Test
	void testSetSaldo() {
		cuenta.setSaldo(100);
		assertEquals (100, cuenta.getSaldo());
	}

	@Test
	void testGetSaldo() {
		double saldo = cuenta.getSaldo();
		assertEquals(100, saldo);
	}
}
