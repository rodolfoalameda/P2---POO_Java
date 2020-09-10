package ExImc;

public class MainHumanoImc {
	public static void main(String[] args) {

		HumanoImc Humano = new HumanoImc("Rodolfo", 27, 1.80, 71.5, "Masculino");

		Humano.calculaImc(1.80, 71.5);
		System.out.println(Humano.toString());
	}
}
