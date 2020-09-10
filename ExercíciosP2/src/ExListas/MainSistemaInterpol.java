package ExListas;

public class MainSistemaInterpol {
	public static void main(String[] args) {

		SistemaInterpol case1 = new SistemaInterpol();
		case1.adicionarProcurados("tati");
		case1.adicionarProcurados("rodolfo");
		System.out.println(case1.ehProcurado("tatiana"));
		System.out.println(case1.ehProcurado("rodolfo"));

	}
}
