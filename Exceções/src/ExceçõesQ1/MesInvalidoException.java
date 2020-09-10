package ExceçõesQ1;

public class MesInvalidoException extends Exception {

	public MesInvalidoException(int mesEscolhido) {
		super("O mes selecionado " + mesEscolhido + " é menor que 1, ou maior que 12." );
	}

}
