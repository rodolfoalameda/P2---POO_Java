package Ex2;

import java.util.TreeSet;


public class Ex2Tree {

	public static void main(String[] args) {

		// insercao

		long start = System.currentTimeMillis();

		TreeSet<Integer> example = new TreeSet<Integer>();
		int total = 300000;

		for (int i = 0; i <= total; i++) {
			example.add(i);
		}

		long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("Tempo gasto Ts: " + elapsedTime);

///////////////////////////////////////////////////////////////////////////////

		// navegacao

		long start2 = System.currentTimeMillis();

		for (int i = 0; i < example.size(); i++) {
			example.contains(i);
		}

		long elapsedTime2 = System.currentTimeMillis() - start2;
		System.out.println("Tempo gasto Ts: " + elapsedTime2);

///////////////////////////////////////////////////////////////////////////////

		// obtencao

		long start3 = System.currentTimeMillis();

		for (int i = 0; i < example.size(); i++) {
			example.last();
		}

		long elapsedTime3 = System.currentTimeMillis() - start3;
		System.out.println("Tempo gasto Ts: " + elapsedTime3);

////////////////////////////////////////////////////////////////////////////////		

		// remocao

		long start4 = System.currentTimeMillis();

		for (int i = 0; i < example.size(); i++) {
			example.remove(i);
		}

		long elapsedTime4 = System.currentTimeMillis() - start4;

		System.out.println("Tempo gasto Ts: " + elapsedTime4);
	}
///////////////////////////////////////////////////////////////////////////////


	
	
	
	
	
	
	
	
	
	
	
}
