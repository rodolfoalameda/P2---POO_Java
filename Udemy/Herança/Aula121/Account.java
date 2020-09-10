package Aula121;

public class Account {

	private int numero;
	private String cliente;
	protected double saldo;

	public Account() {

	}

	public Account(int numero, String cliente, double saldo) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double quantia) {
		saldo -= quantia + 5;
	}

	public void depositar(double quantia) {
		saldo += quantia;
	}

}
