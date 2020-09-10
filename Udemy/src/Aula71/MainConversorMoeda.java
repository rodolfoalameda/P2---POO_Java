package Aula71;

import java.util.Scanner;

public class MainConversorMoeda {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ConversorMoeda case1 = new ConversorMoeda();
		
		System.out.print("Qual o preco de dolar? ");
		case1.precoDolar = input.nextDouble();
		System.out.print("Quantos dolares você quer comprar? ");
		case1.compraDolar = input.nextDouble();
		System.out.print("A quantidade a ser paga em reais é: " + case1.conversor());
	}
	
	
}
