package Input;

import java.util.Scanner;

public class Input1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int input1;
		input1 = input.nextInt();
		System.out.print("Digite o segundo numero: ");
		int input2;
		input2 = input.nextInt();
		int resultado = input1 + input2;
		System.out.println("O resultado da soma vale: " + resultado);
		input.close();
	}

}
