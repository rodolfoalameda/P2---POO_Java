
public class DeltaEqua��o {
	public static void main(String[]args) {
		
		int a = 5;
		int b = 2;
		int c = 0;
		int delta = (b * b) - (4 * a * c);
		
		if(delta < 0) {
			System.out.println("N�o existem ra�zes reais");
		}
		else if(delta == 0) {
			System.out.print("Delta vale: "+ delta);
			System.out.print("Existe apenas uma raiz real");
		}
		else {
			System.out.println("Existem duas raizes reais");
			System.out.println(delta);	
		}
		
	}

}
