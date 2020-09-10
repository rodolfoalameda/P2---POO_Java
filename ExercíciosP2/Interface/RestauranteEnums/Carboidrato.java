package RestauranteEnums;

public enum Carboidrato {

	ARROZ(2.0), FEIJAO(1.80);

	private double custo;

	private Carboidrato(double custo) {
		this.custo = custo;
	}

	public double getCusto() {
		return custo;
	}
}
