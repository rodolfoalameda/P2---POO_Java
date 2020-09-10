package Figura;

public class Circulo extends Figura {

	private double raio;

	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	@Override
	public double calculaArea() {
		return 3.14 * getRaio() * getRaio();
	}

	@Override
	public double calculaPerimetro() {
		return 2 * 3.14 * getRaio();
	}

}
