package ejemplopipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiezxcientoTest {

	@Test
	public void testDiezxciento() throws Exception {
		Diezxciento diezxciento = new Diezxciento(23000000,900000);
		assertEquals(2300000, diezxciento.diezxciento());
	}

	@Test
	public void testImpuesto() throws Exception {
		Diezxciento saldo = new Diezxciento(23000000,900000);
		assertEquals(0, saldo.impuesto());

		saldo = new Diezxciento(23000000,2000000);
		assertEquals(230000, saldo.impuesto());
	}

	@Test
	public void testSaldoAhorro() throws Exception {
		Diezxciento saldo = new Diezxciento(23000000,900000);
		assertEquals(20700000, saldo.saldoAhorro());
	}

}

