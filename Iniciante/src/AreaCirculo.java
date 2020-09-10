import java.util.Scanner;
public class AreaCirculo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double pi = 3.14;
		double raio;
		
		System.out.println("Qual o raio do circulo? ");
		raio = input.nextDouble();
		
		double area = pi * raio;
		
		System.out.println("A área do circulo vale: "+ area);
		
	}
}
