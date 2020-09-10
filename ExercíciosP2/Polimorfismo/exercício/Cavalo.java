package exercício;

public class Cavalo extends Animal {

	public Cavalo() {

	}

	public Cavalo(String nome, int idade) {
		super(nome, idade);

	}

	public void correr() {
		System.out.println("Cavalo correndo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Inririri");
	}

}
