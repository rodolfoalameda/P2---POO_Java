package Exce��esQ1;

public class MesInvalidoException extends Exception {

	public MesInvalidoException(int mesEscolhido) {
		super("O mes selecionado " + mesEscolhido + " � menor que 1, ou maior que 12." );
	}

}
