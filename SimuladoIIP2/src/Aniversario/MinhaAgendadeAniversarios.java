package Aniversario;

import java.util.ArrayList;
import java.util.List;

public class MinhaAgendadeAniversarios implements AgendadeAniversarios {

	private List<Aniversariante> aniversariantes;

	public MinhaAgendadeAniversarios() {
		super();
		this.aniversariantes = aniversariantes = new ArrayList<>();
	}

	@Override
	public void adicionarAniversariante(Aniversariante a) {
		aniversariantes.add(a);
	}

	@Override
	public ArrayList<String> obterAniversarianteDoMes(int mes) {
		ArrayList<String> nomes = new ArrayList<String>();
		for (int i = 0; i < aniversariantes.size(); i++) {
			if (aniversariantes.get(i).getData().getMes() == mes) {
				nomes.add(aniversariantes.get(i).getNome());

			}

		}
		return nomes;
	}

	@Override
	public void removerAniversariante(String nome) throws PessoaInvalidaException {
		for (int i = 0; i < aniversariantes.size(); i++) {
			if (nome == aniversariantes.get(i).getNome()) {
				aniversariantes.remove(i);
			} else {
				throw new PessoaInvalidaException();
			}
		}
	}

	public ArrayList<String> imprimeLista() {
		ArrayList<String> listaCompleta = new ArrayList<String>();
		for (Aniversariante a : aniversariantes) {
			listaCompleta.add(a.getNome() + " " + a.getData());
		}
		return listaCompleta;
	}

	@Override
	public int getTamanho() {
		return aniversariantes.size();
	}

}
