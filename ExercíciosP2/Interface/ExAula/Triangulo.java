package ExAula;

public class Triangulo implements Forma {

	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double getPerimetro() {
		return base * 3;
	}

	@Override
	public double getArea() {
		return (base * altura) / 2;
	}

}
