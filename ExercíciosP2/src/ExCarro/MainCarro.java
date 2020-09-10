package ExCarro;

public class MainCarro {
	public static void main(String[] args) {

		Carro case1 = new Carro("Palio", "Fiat", 35000);
		Carro case2 = new Carro("Palio", "Fiat", 35000);
		Carro case3 = new Carro("Civic", "Honda", 110000);
		Carro case4 = new Carro("Corola", "Toyota", 110000);
		Carro case5 = new Carro();

		case1.cor = "branco";
		case1.portas = 2;

		case2.cor = "prateado";
		case2.portas = 2;

		case3.cor = "prateado";
		case3.portas = 4;
		case3.vidroEletrico = true;
		case3.arCondicionado = true;
		case3.cambioAutomatico = true;
		case3.direcaoEletrica = true;

		case4.cor = "preto";
		case4.portas = 4;
		case4.arCondicionado = true;
		case4.vidroEletrico = true;
		case4.direcaoEletrica = true;

		case5.nome = "gol";
		case5.marca = "volkwagen";
		case5.cor = "branco";
		case5.portas = 4;
		case5.vidroEletrico = true;
		case5.arCondicionado = true;
		case5.cambioAutomatico = true;
		case5.direcaoEletrica = true;
		case5.precoBase = 55000;

		System.out.print(case1);
		System.out.println(case1.calculaPreco());
		System.out.print("\n" + case2);
		System.out.println(case2.calculaPreco());
		System.out.print("\n" + case3);
		System.out.println(case3.calculaPreco());
		System.out.print("\n" + case4);
		System.out.println(case4.calculaPreco());
		System.out.print("\n" + case5);
		System.out.println(case5.calculaPreco());

	}
}
