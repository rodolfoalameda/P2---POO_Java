package ProvaII;

public class Carro {

	private String modelo;
	private String marca;
	private int ano;
	private double diaria;
	private boolean alugado;

	public Carro(String modelo, String marca, int ano, double diaria) {

		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.diaria = diaria;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}
	
	public double getDiaria() {
		return diaria;
	}
}
