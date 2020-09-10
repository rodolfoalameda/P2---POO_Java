package RestauranteEnums;

public enum Proteina {

	PICANHA(20.0), CUPIM(18.0);

	private double custo;

	private Proteina(double custo) {
		this.custo = custo;
	}

	public double getCusto() {
		return custo;
	}
}
