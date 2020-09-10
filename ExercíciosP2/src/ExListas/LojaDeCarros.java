package ExListas;

import java.util.ArrayList;
import java.util.List;

public class LojaDeCarros {

	List<Carro> carrosDisponiveis = new ArrayList<Carro>();
	List<Carro> carrosVendidos = new ArrayList<Carro>();

	public void adicionarCarro(Carro carro) {
		carrosDisponiveis.add(carro);
	}

	public void exibirCarrosDisponiveis() {
		System.out.println(carrosDisponiveis);
	}

	public void exibirCarrosVendidos() {
		System.out.println(carrosVendidos);
	}

	public void venderCarro(int id) {
		for (int i = 0; i < carrosDisponiveis.size(); i++) {
			if (carrosDisponiveis.get(i).id == id) {
				carrosVendidos.add(carrosDisponiveis.get(i));
				carrosDisponiveis.remove(i);
			}
		}

	}

	public void adicionarPromocao(int id) {
		for (int i = 0; i < carrosDisponiveis.size(); i++) {
			if (carrosDisponiveis.get(i).id == id) {
				double promo = carrosDisponiveis.get(i).precoBase;
				carrosDisponiveis.get(i).precoBase = (promo) - (promo * 15 / (100));
			}
		}
	}

	public double computaApuradoDasVendas() {
		double apurado = 0;
		for (int i = 0; i < carrosVendidos.size(); i++) {
			apurado += carrosVendidos.get(i).precoBase;
		}
		return apurado;
	}

	public void limparVendidos() {
		carrosVendidos.clear();
	}

}
