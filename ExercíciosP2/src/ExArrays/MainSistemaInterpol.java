package ExArrays;

public class MainSistemaInterpol {
	public static void main(String[] args) {
		
		SistemaInterpol case1 = new SistemaInterpol();
		
		case1.adicionarProcurados();
		System.out.println(case1.ehProcurado("rodolfo")); 
		System.out.println(case1.ehProcurado("eduardo")); 
		
	}
}
