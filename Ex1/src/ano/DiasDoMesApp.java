package ano;

public class DiasDoMesApp {
	public static void main(String[] args) {
		Ano ano = new Ano();

		int numeroDoAno = 2012;
		ano.setNumero(2012);
		for (int mes = 1; mes <= 12; mes++) {
			System.out.println("M�s " + mes + " de " + numeroDoAno + " tem " + ano.getQtdDias(mes) + " dias");
		}
		System.out.println();

		numeroDoAno = 2015;
		ano.setNumero(2015);
		for (int mes = 1; mes <= 12; mes++) {
			System.out.println("M�s " + mes + " de " + numeroDoAno + " tem " + ano.getQtdDias(mes) + " dias");
		}
		System.out.println();

	}
}
