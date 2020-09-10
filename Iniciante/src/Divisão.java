import java.util.Scanner;

public class Divisão {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = input.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = input.nextInt();
		
		double div = num1 / num2;
		
		System.out.println(div);
		
	}	
}
