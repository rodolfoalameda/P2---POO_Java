package Simulado;

public class Main {

	public static void main(String[] args) throws AnoInvalidoException {

		Autor autor = new Autor("Eduardo", "Lucena", "Falcao");

		try {
			Artigo artigo = new Artigo(autor, 2020, "Progamação Orientada a objetos");
			ModeloInternacional mi = new ModeloInternacional();
			ModeloNacional mn = new ModeloNacional();
			System.out.println(mi.getCitacao(artigo));
			System.out.println(mn.getCitacao(artigo));
		} catch (AnoInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

	}

}
