package ExArrays;
import java.util.Scanner;
public class SistemaInterpol {

	String [] procurados = new String [3];
	Scanner input = new Scanner(System.in);
	
	public void adicionarProcurados() {
		for(int i = 0; i < procurados.length; i ++) {
			System.out.println("Nome do procurado: ");
			procurados[i] = input.nextLine();
		}
	}
	
	public boolean ehProcurado(String nome) {
		String aux;
		boolean procurado = false;
		for(int i = 0; i < procurados.length; i++) {
			aux = procurados[i];
			if(aux.equals(nome)) {
				procurado = true;
			}
		}
		return procurado;
	}
	
}
