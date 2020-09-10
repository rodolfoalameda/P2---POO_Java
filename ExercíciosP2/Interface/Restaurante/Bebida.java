package Restaurante;

import RestauranteEnums.SaborBebida;
import RestauranteEnums.Tamanho;

public class Bebida implements Item {

	private Tamanho tamanho;
	private SaborBebida sabor;

	public Bebida(Tamanho tamanho, SaborBebida sabor) {
		super();
		this.tamanho = tamanho;
		this.sabor = sabor;
	}

	@Override
	public double getPreco() {
		return tamanho.getCusto() + sabor.getCusto();
	}

	@Override
	public String getDescricao() {
		return tamanho.name() + " " + sabor.name();
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	public SaborBebida getSabor() {
		return sabor;
	}

}
