package ExListas;

import java.util.List;
import java.util.ArrayList;

public class MainListaMathUtils {
	public static void main(String[] args) {

		//System.out.println(ListaMathUtils.calculaDivisores(19));
		
//		List <Double> numeros = new ArrayList <Double>();
//		numeros.add(Double.valueOf(12.4));
//		numeros.add(Double.valueOf(2.4));
//		numeros.add(Double.valueOf(412.4));
//		numeros.add(Double.valueOf(18.4));
//		System.out.println(ListaMathUtils.computaMaior(numeros));
		
//		List <Double> numeros = new ArrayList <Double>();
//		numeros.add(Double.valueOf(12.4));
//		numeros.add(Double.valueOf(2.4));
//		numeros.add(Double.valueOf(412.4));
//		numeros.add(Double.valueOf(18.4));
//		System.out.println(ListaMathUtils.computaMenor(numeros));
		
//		List <Double> numeros = new ArrayList <Double>();
//		numeros.add(Double.valueOf(5.0));
//		numeros.add(Double.valueOf(6.0));
//		numeros.add(Double.valueOf(7.0));
//		System.out.println(ListaMathUtils.computaMedia(numeros));
		
		List <Double> numeros = new ArrayList <Double>();
		numeros.add(Double.valueOf(2.4));
		numeros.add(Double.valueOf(12.4));
		numeros.add(Double.valueOf(412.4));
		numeros.add(Double.valueOf(18.4));
		System.out.println(ListaMathUtils.temNumRepetido(numeros));
		
	}
}
