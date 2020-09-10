package Teste;

public class Carro {

	private String nome;
	private int chassi;

	public Carro(String nome, int chassi) {
		super();
		this.nome = nome;
		this.chassi = chassi;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

	public String toString() {
		String output = "";
		output += "Modelo: " + getNome() + " chassi: " + getChassi();
		return output;

	}

}
