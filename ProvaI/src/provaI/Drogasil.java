package provaI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Drogasil {

	private Remedio[] estoque;
	private int tamanho;

	public Drogasil() {
		estoque = new Remedio[10];
	}

	public void adicionarRemedio(Remedio r) {
		if (tamanho >= 10) {
			duplicaTamanho();
		} else {
			estoque[tamanho] = r;
		}
		tamanho++;

	}

	public void duplicaTamanho() {
		Remedio[] temp = new Remedio[tamanho * 2];
		for (int i = 0; i < estoque.length; i++) {
			temp = estoque;
		}
		estoque = temp;
	}

	public void adicionarRemedio(double preco, String nome, String bula, Data dataVencimento) {
		Remedio r = new Remedio(preco, nome, bula, dataVencimento);
		adicionarRemedio(r);
	}

	public int getQuantidadeRemedios() {
		return estoque.length;
	}

	public List<Remedio> getRemediosComPalavra(String palavra) {
		List<Remedio> resposta = new ArrayList<Remedio>();
		for (int i = 0; i < estoque.length; i++) {
			if (estoque[i].getNome().contains(palavra)) {
				resposta.add(estoque[i]);
			}
		}
		return resposta;
	}

	public List<Remedio> getRemedioVencidos() {
		LocalDate data = java.time.LocalDate.now();
		List<Remedio> resposta = new ArrayList<Remedio>();
		for (int i = 0; i < estoque.length; i++) {
			if (estoque[i].getDataVencimento().getAno() >= data.getYear()
					&& estoque[i].getDataVencimento().getMes() >= data.getMonthValue()
					&& estoque[i].getDataVencimento().getDia() > data.getDayOfMonth()) {
				resposta.add(estoque[i]);
			}
		}
		return resposta;
	}

	public List<Remedio> removeRemediosVencidos() {
		List<Remedio> temp = new ArrayList<Remedio>();
		List<Remedio> temp2 = new ArrayList<Remedio>();
		List<Remedio> temp3 = new ArrayList<Remedio>();
		temp = getRemedioVencidos();
		for (int i = 0; i < estoque.length; i++) {
			temp2.add(estoque[i]);
			temp3.add(temp2.get(i));
			temp3.add(temp.get(i));

		}

		for (int i = 0; i < temp3.size(); i++) {
			if (temp3.contains(temp)) {
				temp3.remove(temp.get(i));
			}
		}
		return temp3;

	}

}
