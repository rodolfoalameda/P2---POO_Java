package RestauranteEnums;

public enum Tamanho {

	PEQUENO(1.0), MEDIO(2.00), GRANDE(4.00);
	
	private double custo;

	private Tamanho(double custo) {
		this.custo = custo;
	}
	
	public double getCusto() {
		return custo;
	}
	
}
