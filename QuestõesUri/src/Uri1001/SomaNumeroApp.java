package Uri1001;

import java.util.Scanner;

public class SomaNumeroApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Primeiro numero: ");
		int num1 = input.nextInt();
		System.out.print("Segundo numero: ");
		int num2 = input.nextInt();
		SomaNumero soma = new SomaNumero();
		soma.somaValor(num1, num2);

	}
}
