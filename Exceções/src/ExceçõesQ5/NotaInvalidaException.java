package Exce��esQ5;

public class NotaInvalidaException extends Exception {

	NotaInvalidaException(double nota) {
		super("A nota " + nota + " informada n�o � valida.");
	}

}
