package Simulado;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ModeloInternacionalTest {

	Autor autor;
	Autor b;
	Artigo artigo;
	EstrategiaCitacao mi;
	
	
	@Before
	public void setUp() throws AnoInvalidoException {
		autor = new Autor("Eduardo", "Lucena", "Falcao");
		b = autor;
		artigo = new Artigo(autor, 2020, "Progama��o Orientada a objetos");
		mi = new ModeloInternacional();
		
	}
	
	@Test
	public void testGetCitacao() {
		Assert.assertEquals("FALCAO, E.L, Progama��o Orientada a objetos, 2020.", mi.getCitacao(artigo));
		Assert.assertEquals(b, autor);
	}
	
}
