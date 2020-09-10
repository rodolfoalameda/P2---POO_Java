package Restaurante;

import java.util.ArrayList;
import java.util.List;

import RestauranteEnums.Carboidrato;
import RestauranteEnums.Proteina;
import RestauranteEnums.SaborBebida;
import RestauranteEnums.Tamanho;

public class Cardapio {

	private List<Bebida> bebidas;
	private List<Refeicao> pratos;

	public Cardapio() {

		pratos = new ArrayList<Refeicao>();
		bebidas = new ArrayList<Bebida>();

		Refeicao r1 = new Refeicao(Proteina.CUPIM, Carboidrato.ARROZ);
		Refeicao r2 = new Refeicao(Proteina.PICANHA, Carboidrato.FEIJAO);
		Bebida b1 = new Bebida(Tamanho.PEQUENO, SaborBebida.LARANJA);
		Bebida b2 = new Bebida(Tamanho.MEDIO, SaborBebida.UVA);
		Bebida b3 = new Bebida(Tamanho.GRANDE, SaborBebida.CERVEJA);

		pratos.add(r1);
		pratos.add(r2);
		bebidas.add(b1);
		bebidas.add(b2);
		bebidas.add(b3);

	}

	public void getRefeicoes() {
		for (Refeicao r : pratos) {
			System.out.println(r.getDescricao());
		}

	}

	public void getBebidas() {
		for (Bebida b : bebidas) {
			System.out.println(b.getDescricao());
		}
	}

}
