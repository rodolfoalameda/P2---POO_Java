package Banco;

public class ContaPoupanca extends ContaBancaria {

	public static double taxa = 5;

	public ContaPoupanca(String nome, String senha, double saldo) {
		super(nome, senha, saldo);

	}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta)
			throws SenhaInvalidaException, SaldoInsuficienteException {

		if (this.senha.equals(senha)) {
			if (valor <= this.saldo) {
				this.saldo -= valor + taxa;
				conta.saldo += valor;
			} else
				throw new SaldoInsuficienteException();

		} else
			throw new SenhaInvalidaException();

	}
}
