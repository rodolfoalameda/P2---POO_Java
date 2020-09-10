package ProvaII;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TesteLocadora {

	Carro c;
	Locadora locadora;

	@Before
	public void setUp() {
		c = new Carro("Uno", "Fiat", 2020, 3.8);
		locadora = new Movida();
	}

	@Test
	public void testAdicionarCarro() throws CarroInexistenteException {
		locadora.adicionarCarro("Uno", "Fiat", 2020, 3.8);
		Assert.assertEquals(1, locadora.tamanhoLista());

		locadora.getCarro();
		Assert.assertEquals("Uno Fiat 2020", locadora.getCarro());

		locadora.removerCarro("Uno", "Fiat", 2020);
		Assert.assertEquals(0, locadora.tamanhoLista());

	}

}
