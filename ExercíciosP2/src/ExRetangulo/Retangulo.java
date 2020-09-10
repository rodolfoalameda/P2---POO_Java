package ExRetangulo;

public class Retangulo {

	private double altura;
	private double largura;

	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double getPerimetro() {
		return altura + altura + largura + largura;
	}

	public double getArea() {
		return largura * altura;
	}

	public String toString() {
		return "Altura = " + altura + ", Largura = " + largura;
	}

	public double getLargura() {
		return largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
		System.out.println("Nova largura definida para: " + largura);
	}

	public void setAltura(double altura) {
		this.altura = altura;
		System.out.println("Nova altura definida para: " + altura);
	}
}
