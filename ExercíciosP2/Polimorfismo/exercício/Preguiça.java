package exerc�cio;

public class Pregui�a extends Animal {

	public Pregui�a() {

	}

	public Pregui�a(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public void emitirSom() {
		System.out.println("ZzzZZzzzzZZ");
	}

	public void escalarArvore() {
		System.out.println("N�o");
	}
}
