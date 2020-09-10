package Restaurante;

import RestauranteEnums.Carboidrato;
import RestauranteEnums.Proteina;

public class Refeicao implements Item {

	private Proteina prot;
	private Carboidrato carb;

	public Refeicao(Proteina prot, Carboidrato carb) {
		super();
		this.prot = prot;
		this.carb = carb;
	}

	@Override
	public double getPreco() {
		return prot.getCusto() + carb.getCusto();
	}

	@Override
	public String getDescricao() {
		return prot.name() + " com " + carb.name();
	}

	public Proteina getProteina() {
		return prot;
	}

	public Carboidrato getCarboidrato() {
		return carb;
	}

}
