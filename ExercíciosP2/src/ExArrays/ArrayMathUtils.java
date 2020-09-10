package ExArrays;

import java.util.Arrays;

public class ArrayMathUtils {

	public static int[] calculaDivisores(int num) {
		int[] arrayTeste = new int[13];
		for (int i = 1; i < arrayTeste.length; i++) {
			if (num % i == 0) {
				arrayTeste[i] = i;
			}
		}
		return arrayTeste;
	}

	public static double computaMaior(double[] numeros) {
		Arrays.sort(numeros);
		return numeros[numeros.length - 1];
	}

	public static double computaMenor(double[] numeros) {
		Arrays.sort(numeros);
		return numeros[0];
	}

	public static double computaMedia(double[] numeros) {
		double soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma / numeros.length;
	}

	public static boolean temNumRepetido(double[] numeros) {
		boolean repetido = false;
		double aux1;
		double aux2;
		for (int i = 0; i < numeros.length - 1; i++) {
			aux1 = numeros[i];
			for (int j = i + 1; j < numeros.length; j++) {
				aux2 = numeros[j];
				if (aux1 == aux2) {
					repetido = true;
				}
			}
		}
		return repetido;
	}

	// m1 = [5,4] m2 = [0,-2]
	// 		[0,2] 		[5,-3]
	// 		[1,-1] 		[-1,0]

	public static int[][] somaMatrizes(int[][] m1, int[][] m2) {
		int[][] soma = new int[m1.length][];

		for (int linha = 0; linha < m1.length; linha++) {

			int numeroColunas = m1[linha].length;
			soma[linha] = new int[numeroColunas];
			for (int colunas = 0; colunas < numeroColunas; colunas++) {
				soma[linha][colunas] = m1[linha][colunas] + m2[linha][colunas];

			}
		}
		return soma;
	}

	static void arrayBiToString(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
