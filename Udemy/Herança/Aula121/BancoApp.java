package Aula121;

public class BancoApp {

	public static void main(String[] args) {

		Account conta1 = new Account(01, "Rodolfo", 0);
		Account conta2 = new Account(02, "Tati", 0);
		BusinessAccount bacc1 = new BusinessAccount(03, "Rosa", 500, 1000);
		BusinessAccount bacc2 = new BusinessAccount(04, "Marcos", 0, 0);
		Account conta3 = new Account(05, "Eudo", 15000);
		Poupanca poup1 = new Poupanca(73, "Rodolfo", 1000, 0);
		Account conta4 = new BusinessAccount(15, "Rodolfo", 10, 500);
		
		
		if (bacc1 instanceof Account) {
			System.out.println("É filho");
		}


//		BusinessAccount bacc3 = (BusinessAccount) conta3;
//
//		if (bacc3 instanceof Account) {
//			System.out.println("Deu certo");
//		}

		conta3.sacar(200);
		System.out.println(conta3.getSaldo());
		
		poup1.sacar(200);
		System.out.println(poup1.getSaldo());
		
		conta4.sacar(3);
		System.out.println(conta4.getSaldo());
		
		
		
	}
}
