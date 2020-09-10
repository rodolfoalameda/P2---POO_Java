package RestauranteEnums;

public enum SaborBebida {

	LARANJA(5.0), UVA(4.5), CERVEJA(7.0);
	
	private double custo;

	private SaborBebida(double custo) {
		this.custo = custo;
	}
	
	public double getCusto() {
		return custo;
	}
	
}
