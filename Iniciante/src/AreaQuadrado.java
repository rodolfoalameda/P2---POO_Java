import java.util.Scanner;

public class AreaQuadrado {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double ladoA;
		double ladoB;
		
		System.out.println("Informe a medida de um dos lados: ");
		ladoA = input.nextDouble();
		System.out.println("Informe a medida do lado restante: ");
		ladoB = input.nextDouble();
		
		double area = ladoA * ladoB;
		
		System.out.println("A área equivale a: "+ area);
	}

}
