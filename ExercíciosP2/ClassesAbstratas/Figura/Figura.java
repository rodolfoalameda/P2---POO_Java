package Figura;

public abstract class Figura {

	private Cor cor;

	public Figura(Cor cor) {
		this.cor = cor;
	}

	public abstract double calculaArea();
	public abstract double calculaPerimetro();

	public Cor getCor() {
		return cor;
	}
}
