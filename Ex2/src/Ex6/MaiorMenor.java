package Ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaiorMenor {

	public static void main(String[] args) {

		List<Integer> example = new ArrayList<Integer>();

		for (int i = 0; i <= 5; i++) {
			example.add(i);
			Collections.sort(example);
		}
		System.out.println("Lesser: " + example.get(0));
		System.out.println("Greater: " + example.get(example.size() - 1));

	}
}
