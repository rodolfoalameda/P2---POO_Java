package Banco;

public class BancoApp {

	public static void main(String[] args) throws SenhaInvalidaException, SaldoInsuficienteException {

		ContaBancaria c1 = new ContaPoupanca("rodolfo", "rodolfo", 1000);
		ContaBancaria c2 = new ContaCorrente("Eudo", "eudo", 1000);

//		c1.transferir("rodolfo", 500, c2);
//		System.out.println(c1.getSaldo());
//		System.out.println(c2.getSaldo());

		c2.transferir("eudo", 500, c1);
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());

	}

}
