package Aula68;

public class Retangulo {

	public double altura;
	public double largura;

	Retangulo() {

	}

	double calculaArea() {
		return altura * largura;
	}

	double calculaPerimetro() {
		return (altura * 2) + (largura * 2);
	}

	double calculaDiagonal() {
		double diagonal = (altura * altura) + (largura * largura);
		return Math.sqrt(diagonal);
	}

}
