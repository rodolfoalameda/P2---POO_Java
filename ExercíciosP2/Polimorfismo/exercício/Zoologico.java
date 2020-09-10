package exercício;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

	List<Animal> jaula;

	public Zoologico() {
		jaula = new ArrayList<Animal>();

		Animal a1 = new Cachorro("Elza", 3);
		jaula.add(a1);
		Animal a2 = new Cavalo("Max", 7);
		jaula.add(a2);
		Animal a3 = new Preguiça("Ze", 19);
		jaula.add(a3);

	}

	public void cutucarAnimal() {
		for (Animal a : jaula) {
			a.emitirSom();
			if (a instanceof Cachorro) {
				((Cachorro) a).correr();
			} else if (a instanceof Cavalo) {
				((Cavalo) a).correr();
			} else if (a instanceof Preguiça) {
				((Preguiça) a).escalarArvore();
			}
		}
	}

	public static void main(String[] args) {

		Zoologico bica = new Zoologico();
		bica.cutucarAnimal();

	}
}
