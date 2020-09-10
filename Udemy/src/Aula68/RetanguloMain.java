package Aula68;

import java.util.Scanner;

public class RetanguloMain {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Retangulo retangulo1 = new Retangulo();

		System.out.print("Entre com as medidas da largura e da altura do retangulo: ");
		retangulo1.largura = input.nextDouble();
		retangulo1.altura = input.nextDouble();
		
		System.out.println("A área vale: " + retangulo1.calculaArea());
		System.out.println("O perímetro vale: " + retangulo1.calculaPerimetro());
		System.out.println("A diagonal vale: " + retangulo1.calculaDiagonal());
		
	}
}
