package Aula80;

import java.util.Scanner;

public class MainBancoConta {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com a conta: ");
		int numeroConta = input.nextInt();
		System.out.println("Nome: ");
		input.nextLine();
		String nome = input.nextLine();
		System.out.println("Deposito inicial: ");
		int depositoInicial = input.nextInt();
		int saldo = depositoInicial;
		
		BancoConta conta1 = new BancoConta(numeroConta, nome, depositoInicial, saldo);

		System.out.println(conta1);
		
		conta1.setName("Elle Tatiana");
		
		System.out.println(conta1);
			
		System.out.println("Qual valor voce deseja depositar? ");
		double quantiaDeposito = input.nextDouble();
		conta1.depositaValor(quantiaDeposito);
		System.out.println("Nome do titular: " + conta1.getName());
		System.out.println("Saldo: " + conta1.getSaldo());
		
		System.out.println("Qual valor voce deseja sacar? ");
		double quantiaSaque = input.nextDouble();
		conta1.sacaValor(quantiaSaque);
		System.out.println("Nome do titular: " + conta1.getName());
		System.out.println("Saldo: " + conta1.getSaldo());

	}
}
