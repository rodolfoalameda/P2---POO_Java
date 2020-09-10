package Restaurante;

import java.util.ArrayList;
import java.util.List;

public class SistemaRestaurante {

	private List<Cliente> clientes;

	public SistemaRestaurante() {
		clientes = new ArrayList<Cliente>();
	}

	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void adicionarPedido(Cliente cliente, Item item) {
		cliente.adicionarPedido(item);
	}

	public void removerPedido(Cliente cliente, Item item) {
		cliente.removerPedido(item);
	}

	public double computarPagamentoCliente(Cliente cliente, int mesa) {
		return cliente.getConta(mesa);
	}

	public void receberPagamentoCliente(Cliente cliente) {
		clientes.remove(cliente);
		System.out.println("Conta Paga");
	}

}
