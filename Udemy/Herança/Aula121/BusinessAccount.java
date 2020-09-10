package Aula121;

public class BusinessAccount extends Account {

	private double limiteEmprestimo;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(int numero, String cliente, double saldo, double limiteEmprestimo) {
		super(numero, cliente, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void emprestimo(double quantia) {
		if (quantia <= limiteEmprestimo) {
			saldo += quantia;
		}

	}
	
	@Override
	public void sacar(double quantia) {
		super.sacar(quantia);
		saldo -= 2;
	}
	
	
}
