package Restaurante;

import RestauranteEnums.Carboidrato;
import RestauranteEnums.Proteina;
import RestauranteEnums.SaborBebida;
import RestauranteEnums.Tamanho;

public class SistemaRestauranteApp {

	public static void main(String[] args) {

		Cardapio cardapio = new Cardapio();

//		cardapio.getBebidas();
//		cardapio.getRefeicoes();
		Refeicao r1 = new Refeicao(Proteina.CUPIM, Carboidrato.ARROZ);
		Bebida b1 = new Bebida(Tamanho.PEQUENO, SaborBebida.LARANJA);

		Cliente c = new Cliente(1);
		SistemaRestaurante r = new SistemaRestaurante();
		r.adicionarCliente(c);
		r.adicionarPedido(c, b1);
		r.adicionarPedido(c, r1);
		c.adicionarPedido(r1);
		c.adicionarPedido(b1);

		System.out.println(c.getConta(1));

	}

}
