package Aula68;

import java.util.Scanner;

public class MainSalarioFuncionario {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		SalarioFuncionario funcionario = new SalarioFuncionario();
		
		System.out.print("Nome funcionario: ");
		funcionario.nome = input.nextLine();
		System.out.print("Salario bruto: ");
		funcionario.salarioBruto = input.nextDouble();
		System.out.print("Imposto incidente: " );
		funcionario.imposto = input.nextDouble();
		
		System.out.println(funcionario);
		
		System.out.print("Deseja concender qual taxa de aumento? ");
		double taxa = input.nextDouble();
		funcionario.aumentoSalario(taxa);
		
		System.out.println(funcionario);
		
	}
}
