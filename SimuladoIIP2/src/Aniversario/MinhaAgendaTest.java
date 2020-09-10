package Aniversario;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MinhaAgendaTest {

	Aniversariante a1;
	Aniversariante a2;
	Aniversariante a3;
	MinhaAgendadeAniversarios agenda;

	@Before
	public void setUp() throws MesInvalidoException {
		a1 = new Aniversariante("João", new Data(5, 2));
		a2 = new Aniversariante("Maria", new Data(1, 12));
		a3 = new Aniversariante("Eudo", new Data(6, 1));
		agenda = new MinhaAgendadeAniversarios();
	}

	@Test
	public void TestAdicionarAniversariante() {
		agenda.adicionarAniversariante(a1);
		Assert.assertEquals(1, agenda.getTamanho());

	}

	@Test
	public void TestObterAniversarianteDoMes() {
		agenda.adicionarAniversariante(a1);
		agenda.obterAniversarianteDoMes(2);
		Assert.assertEquals(a1, a1);
	}

	@Test
	public void TestRemoverAniversariante() throws PessoaInvalidaException {
		agenda.adicionarAniversariante(a1);
		agenda.adicionarAniversariante(a2);
		agenda.removerAniversariante("João");
		Assert.assertEquals(1, agenda.getTamanho());

	}

}
