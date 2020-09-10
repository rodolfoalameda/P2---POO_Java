package Aula126;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpresaApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<Empregado> empregados = new ArrayList();

		System.out.print("Entre com o numero de empregados: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do empregado " + i + " :");
			System.out.print("Terceirizado (y/n)?");
			char b = input.next().charAt(0);
			System.out.print("Nome: ");
			input.nextLine();
			String nome = input.nextLine();
			System.out.println("Horas trabalhadas: ");
			int horaTrabalhada = input.nextInt();
			System.out.println("Valor por hora: ");
			double valorPorHora = input.nextDouble();
			if (b == 'y') {
				System.out.print("Taxa adicional: ");
				double taxaAdicional = input.nextDouble();
				Empregado emp = new Terceirizado(nome, horaTrabalhada, valorPorHora, taxaAdicional);
				empregados.add(emp);
			} else {
				Empregado emp = new Empregado(nome, horaTrabalhada, valorPorHora);
				empregados.add(emp);
			}

			System.out.println();

		}
		
		System.out.println("Pagamentos: ");

		for (Empregado emp : empregados) {
			System.out.println("Nome: " + emp.getNome() + " Salário: " + emp.pagamento());
		}
	}

}
