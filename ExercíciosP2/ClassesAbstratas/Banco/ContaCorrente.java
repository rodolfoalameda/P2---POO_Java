package Banco;

public class ContaCorrente extends ContaBancaria {

	public static double taxa;

	public ContaCorrente(String nome, String senha, double saldo) {
		super(nome, senha, saldo);

	}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta)
			throws SenhaInvalidaException, SaldoInsuficienteException {
		if (this.senha.equals(senha)) {
			if (valor < this.saldo) {
				if (valor < 5000) {
					taxa = 0.0025 * valor;
				} else {
					taxa = 15;
				}
			}
			if (valor <= this.saldo) {
				this.saldo -= valor + taxa;
				conta.saldo += valor;
			} else {
				throw new SaldoInsuficienteException();
			}

		} else {
			throw new SenhaInvalidaException();
		}
	}

}
