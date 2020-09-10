package Teste;

public class Main {

	public static void main(String[] args) {

		Carro carro = new Carro("Uno", 123456);
		LojaDeCarro loja = new LojaDeCarro();
		loja.adcionaCarro(carro);
		for(int i = 0; i<loja.vitrine.size(); i++) {
			System.out.println(loja.vitrine.get(i));
		}

	}

}
