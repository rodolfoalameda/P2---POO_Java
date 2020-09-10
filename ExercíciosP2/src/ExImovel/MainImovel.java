package ExImovel;

public class MainImovel {
	public static void main(String[] args) {

		Imovel case1 = new Imovel("casa", "imobiliaria falcao", 3, 1, 2, 120, true, false);
		case1.calculaPreco();

		Imovel case2 = new Imovel("apartamento", "imobiliaria falcao", 8, 3, 2, 3, 82, true, false, false);
		case2.calculaPreco();
		
		System.out.println(case1);
		System.out.println(case2);
	}
}
