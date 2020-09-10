package ExceçõesQ6;

public class ValorMinimoParcelaException extends Exception {
	
	public ValorMinimoParcelaException() {
		super("O valor da parcela é menor que o minimo permitido");
	}
}