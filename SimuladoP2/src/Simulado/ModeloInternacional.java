package Simulado;

public class ModeloInternacional implements EstrategiaCitacao {

	public ModeloInternacional() {

	}

	@Override
	public String getCitacao(Artigo artigo) {
		return artigo.getAutor().getUltimoNome().toUpperCase() + ", "
				+ artigo.getAutor().getPrimeiroNome().toUpperCase().charAt(0) + "."
				+ artigo.getAutor().getNomeDoMeio().toUpperCase().charAt(0) + ", " + artigo.getTitulo() + ", "
				+ artigo.getAno() + ".";
	}

}
