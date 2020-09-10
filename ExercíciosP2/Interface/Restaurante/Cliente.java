package Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private int mesa;
	private List<Item> pedidos;

	public Cliente(int mesa) {
		pedidos = new ArrayList<Item>();
		this.mesa = mesa;
	}

	public int getMesa() {
		return mesa;
	}

	public void adicionarPedido(Item item) {
		pedidos.add(item);
	}

	public void removerPedido(Item item) {
		pedidos.remove(item);
	}

	public double getConta(int mesa) {
		double conta = 0;
		for (int i = 0; i < pedidos.size(); i++) {
			conta += pedidos.get(i).getPreco();
		}
		return conta;
	}

}
