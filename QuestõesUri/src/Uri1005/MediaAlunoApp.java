package Uri1005;

import java.util.Scanner;

public class MediaAlunoApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Informe a primeira nota: ");
		double num1 = input.nextDouble();
		System.out.print("Informe a segunda nota: ");
		double num2 = input.nextDouble();
		MediaAluno calcula = new MediaAluno();
		calcula.mediaAluno(num1, num2);

	}
}
