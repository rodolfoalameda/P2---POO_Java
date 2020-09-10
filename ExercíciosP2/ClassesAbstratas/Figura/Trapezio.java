package Figura;

public class Trapezio extends Quadrilatero {

	private double altura;

	public Trapezio(Cor cor, double lado1, double lado2, double lado3, double lado4, double altura) {
		super(cor, lado1, lado2, lado3, lado4);
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public double calculaArea() {
		return getAltura() * (getLado1() + getLado2()) / 2;

	}

	@Override
	public double calculaPerimetro() {
		return getLado1() + getLado2() + getLado3() + getLado4();
	}

}
