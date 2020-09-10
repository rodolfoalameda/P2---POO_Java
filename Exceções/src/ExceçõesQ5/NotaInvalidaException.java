package ExceçõesQ5;

public class NotaInvalidaException extends Exception {

	NotaInvalidaException(double nota) {
		super("A nota " + nota + " informada não é valida.");
	}

}
