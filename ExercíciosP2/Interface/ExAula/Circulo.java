package ExAula;

public class Circulo implements Forma {

	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double getPerimetro() {
		return (2 * 3.14 * raio);
	}

	@Override
	public double getArea() {
		return 3.14 * raio * raio;
	}

}
