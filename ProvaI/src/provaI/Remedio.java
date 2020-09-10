package provaI;

public class Remedio {

	private double preco;
	private String nome, bula;
	private Data dataVencimento;

	public Remedio(double preco, String nome, String bula, Data dataVencimento) {

		this.preco = preco;
		this.nome = nome;
		this.bula = bula;
		this.dataVencimento = dataVencimento;
	}

	public double getPreco() {
		return preco;
	}

	public String getNome() {
		return nome;
	}

	public String getBula() {
		return bula;
	}

	public Data getDataVencimento() {
		return dataVencimento;
	}

	public String toString() {
		String output = "";
		output = "Nome: " + getNome() + "\n";
		output = "Preço: " + getPreco() + "\n";
		output = "Vencimento: " + dataVencimento.getDia() + "/" + dataVencimento.getMes() + "/"
				+ dataVencimento.getAno() + "\n";
		output = "Bula: " + getBula();
		return output;
	}

}
