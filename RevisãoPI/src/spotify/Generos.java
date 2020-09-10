package spotify;

public enum Generos {

	ROCK(1.0), SERTANEJO(1.2), FUNK(1.3);
	
	private double custo;
	
	private Generos(double custo) {
		this.custo = custo;
	}

	public double getCusto() {
		return custo;
	}
	
	
	
}
