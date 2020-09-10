package ExListas;

public class MainLojaDeCarros {
	public static void main(String[] args) {

		Carro carro1 = new Carro(1, "Palio", "Fiat", 35000);
		Carro carro2 = new Carro(2, "Corsa", "Chevrolet", 28000);

		LojaDeCarros loja = new LojaDeCarros();

		loja.adicionarCarro(carro1);
		loja.adicionarCarro(carro2);
		loja.exibirCarrosDisponiveis();
		
		
		

	}
}
