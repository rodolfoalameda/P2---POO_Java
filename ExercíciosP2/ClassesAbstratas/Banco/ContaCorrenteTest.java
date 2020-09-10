package Banco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContaCorrenteTest {

	public ContaCorrente c1;
	public ContaCorrente c2;

	@Before
	public void setUp() {
		c1 = new ContaCorrente("Rodolfo", "rodolfo", 1000);
		c2 = new ContaCorrente("Eudo", "eudo", 1000);
	}

	@Test
	public void testTransferir() throws SenhaInvalidaException, SaldoInsuficienteException {
		c1.transferir("rodolfo", 500, c2);
		Assert.assertEquals(498.75, c1.getSaldo(), 0.001);
		Assert.assertEquals(1500, c2.getSaldo(), 0.001);

	}

}
