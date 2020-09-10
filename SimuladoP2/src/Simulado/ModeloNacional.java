package Simulado;

public class ModeloNacional implements EstrategiaCitacao {

	public ModeloNacional() {

	}

	@Override
	public String getCitacao(Artigo artigo) {
		return artigo.getAutor().getPrimeiroNome().toUpperCase()
				+ " " + artigo.getAutor().getNomeDoMeio().toUpperCase().charAt(0) + "." + " "
				+ artigo.getAutor().getUltimoNome().toUpperCase() + ", " + artigo.getAno() + ", " + artigo.getTitulo() + ".";
	}

}
