package ExAula;

import java.util.ArrayList;
import java.util.List;

public class ColecaoDeFormas {

	private List<Forma> lista;

	public ColecaoDeFormas() {
		super();
		this.lista = new ArrayList<Forma>();

		Quadrado q1 = new Quadrado(5);
		Triangulo t1 = new Triangulo(4, 3);
		Circulo c1 = new Circulo(3);

		lista.add(c1);
		lista.add(t1);
		lista.add(q1);
	}

	public void calculaPerimetro() {
		for (Forma f : lista) {
			System.out.println(f.getPerimetro());
		}
	}

	public void calculaArea() {
		for (Forma f : lista) {
			System.out.println(f.getArea());
		}
	}

	public static void main(String[] args) {

		ColecaoDeFormas cf = new ColecaoDeFormas();
		cf.calculaPerimetro();
		cf.calculaArea();
	}

}
