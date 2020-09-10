package Aula80;

public class BancoConta {

	private int numeroConta;
	private String nome;
	private double depositoInicial;
	private double saldo;

	BancoConta(int numeroConta, String nome, double depositoInicial, double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.depositoInicial = depositoInicial;
		this.saldo = saldo;
	}

	public int getConta() {
		return numeroConta;
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacaValor(double quantiaSaque) {
		this.saldo -= quantiaSaque + 5;
	}

	public void depositaValor(double quantiaDeposito) {
		this.saldo += quantiaDeposito;
	}
	
	public String toString() {
		String output = "";
		output += "Nome: " + nome + "\n";
		output += "Conta: " + numeroConta + "\n";
		output += "Saldo: " + saldo + "\n";
		return output;
	}
	
	

}
