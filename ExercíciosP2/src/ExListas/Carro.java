package ExListas;

public class Carro {

	public String nome, marca, cor;
	public int portas, id;
	public boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	public double precoBase;

	public Carro(int id, String nome, String marca, double precoBase) {
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;

	}

	public Carro(int id, String nome, String marca, String cor, int portas, boolean vidroEletrico,
			boolean arCondicionado, boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
	}

	public Carro() {
		id = 0;
		nome = "sem nome";
		marca = "sem marca";
		cor = "branco";
		portas = 2;
		vidroEletrico = false;
		arCondicionado = false;
		cambioAutomatico = false;
		direcaoEletrica = false;
		precoBase = 0;
	}

	public double calculaPreco() {
		switch (cor) {
		case "branco":
		case "azul":
		case "vermelho":
		case "preto":
			precoBase += 0;
			break;
		default:
			precoBase += 1000;
		}
		if (vidroEletrico) {
			precoBase += 1250;
		}
		if (arCondicionado) {
			precoBase += 1250;
		}
		if (cambioAutomatico) {
			precoBase += 1250;
		}
		if (direcaoEletrica) {
			precoBase += 1250;
		}
		return precoBase;
	}

	public String toString() {
		String output = "";
		output += "Id: " + id + "\n";
		output += "Nome: " + nome + "\n";
		output += "Marca: " + marca + "\n";
		output += "Cor: " + cor + "\n";
		output += "Portas: " + portas + "\n";
		output += "Vidro Eletrico: " + vidroEletrico + "\n";
		output += "Cambio Automatico: " + cambioAutomatico + "\n";
		output += "Direcao Eletrica: " + direcaoEletrica + "\n";
		output += "Ar Condicionado: " + arCondicionado + "\n";
		output += "Preco: " + precoBase;
		return output;
	}

}
