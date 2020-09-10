package Aula126;

public class Empregado {

	private String nome;
	private int horaTrabalhada;
	private double valorPorHora;

	public Empregado() {

	}

	public Empregado(String nome, int horaTrabalhada, double valorPorHora) {

		this.nome = nome;
		this.horaTrabalhada = horaTrabalhada;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHoraTrabalhada() {
		return horaTrabalhada;
	}

	public void setHoraTrabalhada(int horaTrabalhada) {
		this.horaTrabalhada = horaTrabalhada;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public double pagamento() {
		return horaTrabalhada * valorPorHora;
	}

}
