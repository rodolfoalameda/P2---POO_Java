package Uri1002;

import java.util.Scanner;

public class AreaCirculoApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Informe o raio do circulo: ");
		double raio = input.nextDouble();
		AreaCirculo calcula = new AreaCirculo();
		calcula.areaCirculo(raio);

	}

}
