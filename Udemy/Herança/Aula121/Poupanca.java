package Aula121;

public class Poupanca extends Account {

	private double juros;

	public Poupanca() {
		super();
	}

	public Poupanca(int numero, String cliente, double saldo, double juros) {
		super(numero, cliente, saldo);
		this.juros = juros;
	}

	public double getJuros() {
		return juros;
	}

	public double saldoAtualizado() {
		double saldoAtt = saldo * juros;
		return saldoAtt;

	}
	
	@Override
	public void sacar(double quantia) {
		saldo -= quantia;
	}
	
	
}
