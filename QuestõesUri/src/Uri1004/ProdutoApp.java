package Uri1004;

import java.util.Scanner;

public class ProdutoApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Informe o primeiro numero: ");
		int num1 = input.nextInt();
		System.out.print("Informe o segundo numero: ");
		int num2 = input.nextInt();
		Produto calcula = new Produto();
		calcula.Multiplicação(num1, num2);	
	}

}
