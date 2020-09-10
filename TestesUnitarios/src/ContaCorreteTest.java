import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContaCorreteTest {
	
	private ContaCorrente conta;
	
	@Before
	public void setup() {
		conta = new ContaCorrente(1000, 123, "Rodolfo");
	}
	
	@Test
	public void testDepositar() {
		conta.depositar(1000);
		Assert.assertEquals(1000, conta.getSaldo(), 0.00001);
	}

	@Test
	public void testQuantiaNegativa() {
		conta.depositar(-1000);
		Assert.assertEquals(-1000, conta.getSaldo(), 0.0000001);
	}
	
	@Test
	public void testVerificaRetirada () {
		Assert.assertTrue(conta.verificaRetirada(700));
		Assert.assertFalse(conta.verificaRetirada(1001));
	}
	
	@Test 
	public void testDebitar() {
		conta.debitar(500);
		Assert.assertEquals(-500, conta.getSaldo(), 0.000001);
	}
}
