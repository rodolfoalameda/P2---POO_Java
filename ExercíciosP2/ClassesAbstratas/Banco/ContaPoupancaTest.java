package Banco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContaPoupancaTest {

	public ContaPoupanca c1;
	public ContaPoupanca c2;

	@Before
	public void setUp() {
		c1 = new ContaPoupanca("rodolfo", "rodolfo", 1000);
		c2 = new ContaPoupanca("Eudo", "eudo", 1000);
	}

	@Test
	public void testTransferir() throws SenhaInvalidaException, SaldoInsuficienteException {
		c1.transferir("rodolfo", 500, c2);
		Assert.assertEquals(495, c1.getSaldo(), 0.001);
		Assert.assertEquals(1500, c2.getSaldo(), 0.001);
	}

	@Test(expected = SenhaInvalidaException.class)
	public void testSenhaInvalida() throws SenhaInvalidaException, SaldoInsuficienteException {
		c1.transferir("a", 100, c2);
	}

	@Test(expected = SaldoInsuficienteException.class)
	public void testSaldoInsuficiente() throws SenhaInvalidaException, SaldoInsuficienteException {
		c1.transferir("rodolfo", 5000, c2);
	}

}
