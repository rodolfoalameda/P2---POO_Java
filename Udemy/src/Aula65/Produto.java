package Aula65;

public class Produto {

	String nome;
	double preco;
	int quantidade;

	public Produto(String nome, double preco, int quantidade) {

	}

	public double valorTotalDeEstoque() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		String output = "";
		output += "Nome: " + nome + "\n";
		output += "Preco: " + preco + "\n";
		output += "Unidades: " + quantidade + "\n";
		output += "Total: " + valorTotalDeEstoque() + "\n";
		return output;
	}

}
