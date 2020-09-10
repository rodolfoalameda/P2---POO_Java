package ProvaII;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovidaTest {

	Carro c;
	Locadora locadora;

	@Before
	public void setUp() {
		c = new Carro("Uno", "Fiat", 2020, 3.8);
		locadora = new Movida();
	}

	@Test
	public void alugarCarro() throws CarroAlugadoException {
		locadora.alugarCarro("Uno", new Data(1, 2), new Data(8, 2));
		Assert.assertEquals(c, c);

	}

}
