package Aula63;

import java.util.Scanner;

public class MainTriangulo {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Triangulo case1 = new Triangulo();
		System.out.print("Digite a base do triagulo: ");
		case1.a = input.nextDouble();
		System.out.print("Digite a altura do triangulo: ");
		case1.altura = input.nextDouble();
		
		case1.calculaArea();
		System.out.println("A área vale: "+ case1.calculaArea());
	}
}
