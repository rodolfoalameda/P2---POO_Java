package provaI.b;

import java.util.ArrayList;
import java.util.List;

public class GoogleKeep {

	Nota[] notas;
	int tamanho = 0;

	public GoogleKeep() {
		notas = new Nota[10];
	}

	public void adicionarNota(Nota n) {
		notas[tamanho] = n;
		tamanho++;
		if (tamanho > 10) {
			duplicaArray();
		}
	}

	public void adicionarNota(String conteudo, String autor, Data criacao) {
		Nota n = new Nota(conteudo, autor, criacao);
		adicionarNota(n);
	}

	public void duplicaArray() {
		Nota[] auxiliar = new Nota[tamanho * 2];
		for (int i = 0; i < notas.length; i++) {
			auxiliar[i] = notas[i];
		}
		notas = auxiliar;
	}

	public int getQuantidadeNotas() {
		return notas.length;
	}

	public List<Nota> getNotasAutor(String autor) {
		List<Nota> auxiliar = new ArrayList<Nota>();
		for (int i = 0; i < notas.length; i++) {
			if (notas[i].getAutor().equals(autor)) {
				auxiliar.add(notas[i]);
			}
		}
		return auxiliar;
	}

	public List<Nota> getNotasComPalavras(String palavra) {
		List<Nota> auxiliar = new ArrayList<Nota>();
		for (int i = 0; i < notas.length; i++) {
			if (notas[i].getConteudo().contains(palavra)) {
				auxiliar.add(notas[i]);
			}
		}
		return auxiliar;

	}

}
