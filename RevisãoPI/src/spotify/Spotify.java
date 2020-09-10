package spotify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spotify {

	private Musica[] spotify;
	private int tamanho;

	public Spotify() {
		this.spotify = new Musica[10];
	}

	public Spotify(int tamanho) {
		this.spotify = new Musica[tamanho];
	}

	public void adicionarMusica(Musica m) {
		if (tamanho >= 10) {
			duplicaArray();
		}
		spotify[tamanho] = m;
		tamanho++;
	}

	public void duplicaArray() {
		Musica[] temp = new Musica[tamanho * 2];
		for (int i = 0; i < spotify.length; i++) {
			temp = spotify;
		}
		spotify = temp;
	}

	public int numeroDeMusicas() {
		return spotify.length;
	}

	public List<String> musicaPorArtista(String nome) {
		List<String> resultado = new ArrayList<String>();
		for (int i = 0; i < spotify.length; i++) {
			if (nome.equals(spotify[i].getArtista())) {
				resultado.add(spotify[i].getArtista());
			}
		}
		return resultado;

	}

	public List<String> musicaPorAno(int ano) {
		List<String> resultado = new ArrayList<String>();
		for (int i = 0; i < spotify.length; i++) {
			if (ano == spotify[i].getAno()) {
				resultado.add(spotify[i].getNome());
			}
		}
		return resultado;
	}

	public List<String> musicaPorGenero(Generos g) {
		List<String> resultado = new ArrayList<String>();
		for (int i = 0; i < spotify.length; i++) {
			if (g.equals(spotify[i].getGenero())) {
				resultado.add(spotify[i].getNome());
			}
		}
		return resultado;

	}

	public Musica musicaMaiorDuracao() {
		Musica maior = null;
		for (int i = 0; i < spotify.length; i++) {
			if (maior == null) {
				maior = spotify[i];
			} else if (spotify[i].getDuracao() > maior.getDuracao()) {
				maior = spotify[i];
			}
		}
		return maior;
	}

	public Musica musicaMenorDuracao() {
		Musica menor = null;
		for (int i = 0; i < spotify.length; i++) {
			if (menor == null) {
				menor = spotify[i];
			} else if (spotify[i].getDuracao() < menor.getDuracao()) {
				menor = spotify[i];
			}
		}
		return menor;
	}

	public void reproduzirMusica(String nome) {
		for (Musica m : spotify) {
			if (m.getNome().equals(nome)) {
				System.out.println("Tocando agora: " + m.getNome());
			} else {
				System.out.println("Musica não encontrada");
			}
		}
	}

	public int numeroDeReproducoes(String nome) {
		int resultado = 0;
		for (int i = 0; i < spotify.length; i++) {
			if (spotify[i].getNome().equals(nome)) {
				resultado = spotify[i].getNumeroReproducoes();
			} else {
				System.out.println("Musica não encontrada.");
			}
		}
		return resultado;
	}

}
