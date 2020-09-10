package ExListas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaMathUtils {

	public static List calculaDivisores(int num) {

		List<Integer> divisores = new ArrayList<Integer>();
		for (int i = 1; i < num + 1; i++) {
			if (num % i == 0) {
				divisores.add(i);
			}
		}
		return divisores;
	}

	public static double computaMaior(List <Double> numeros) {
		Collections.sort(numeros);
		return numeros.get(numeros.size() - 1);
	}

	public static double computaMenor(List <Double> numeros) {
		Collections.sort(numeros);
		return numeros.get(0);
	}

	
	public static double computaMedia(List <Double> numeros) {
		double soma = 0;
		for(int i = 0; i < numeros.size(); i++) {
			soma += numeros.get(i);	
		}
		return soma/numeros.size();
	}
	
	
	public static boolean temNumRepetido(List <Double> numeros) {
		boolean repetido = false;
		double aux1 = 0;
		double aux2 = 0;
		for(int i = 0; i < numeros.size()-1; i++) {
			aux1 = numeros.get(i);
			for(int j = i + 1; j < numeros.size(); j++) {
				aux2 = numeros.get(j);
				if(aux1 == aux2) {
					repetido = true;
				}
			}
		}
		return repetido;
	}
		
	
	
	
	
	
	
	
	
}
