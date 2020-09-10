package Simulado;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ModeloNacionalTest {

	Autor autor;
	Artigo artigo;
	EstrategiaCitacao mn;
	
	@Before
	public void setUp() throws AnoInvalidoException {
		autor = new Autor("Eduardo", "Lucena", "Falcao");
		artigo = new Artigo(autor, 2020, "Progamação Orientada a objetos");
		mn = new ModeloNacional();		
	}
	
	@Test
	public void testGetCitacao() {
		Assert.assertEquals("EDUARDO L. FALCAO, 2020, Progamação Orientada a objetos.", mn.getCitacao(artigo));
	}
	
}
