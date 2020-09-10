package Aula89;

import java.util.Scanner;

public class MainAluguelQuarto {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		AluguelQuarto[] alugaQuarto = new AluguelQuarto[10];

		System.out.print("Quantos quartos serão alugados? ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Preencha seu nome: ");
			input.nextLine();
			String nome = input.nextLine();
			System.out.print("Preencha seu email: ");
			String email = input.nextLine();
			System.out.print("Qual quarto deseja? ");
			int numeroQuarto = input.nextInt();
			alugaQuarto[numeroQuarto] = new AluguelQuarto(nome, email);
		}
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (alugaQuarto[i] != null) {
				System.out.println("Quarto: " +i + "-" + alugaQuarto[i]);
			}
		}

	}
}
