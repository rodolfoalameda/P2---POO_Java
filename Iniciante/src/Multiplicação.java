import java.util.Scanner;

public class Multiplicação {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = input.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = input.nextInt();
		
		int multiplica = num1 * num2;
		
		System.out.println(multiplica);
	}
}
