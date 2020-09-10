package GoogleAgendaTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestGoogleAgenda {

	private Reuniao a;
	private Reuniao b;
	private GoogleAgenda agenda;

	@Before
	public void setUp() {
		agenda = new GoogleAgenda();
		a = new Reuniao(new Data((short) 1, (short) 1, (short) 2020, (short) 7, (short) 8),
				new ArrayList<String>(Arrays.asList("Pessoa1", "Pessoa2")));
		b = new Reuniao(new Data((short) 2, (short) 2, (short) 2020, (short) 7, (short) 10),
				new ArrayList<String>(Arrays.asList("Pessoa1", "Pessoa2")));
	}

	@Test
	public void testToString() {
		String output = "Dia: 1/1/2020\n";
		output += "Horário: 7 até 8\n";
		output += "Participantes: \nPessoa1\nPessoa2\n";
		Assert.assertEquals(a.toString(), output);
	}

	@Test
	public void testAdicionarReuniao() {
		agenda.adicionarReuniao(a);
		agenda.adicionarReuniao(a);
		agenda.adicionarReuniao(b);
		agenda.adicionarReuniao(a);
		agenda.adicionarReuniao(a);
		agenda.adicionarReuniao(b);
		agenda.adicionarReuniao(a);
		agenda.adicionarReuniao(b);
		agenda.adicionarReuniao(a);
		agenda.adicionarReuniao(a);
		assertEquals(10, agenda.getQuantidadeReunioes());

	}

	
	
	
	
	
	
	
	
}
