package exercício;

public class Preguiça extends Animal {

	public Preguiça() {

	}

	public Preguiça(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public void emitirSom() {
		System.out.println("ZzzZZzzzzZZ");
	}

	public void escalarArvore() {
		System.out.println("Não");
	}
}
