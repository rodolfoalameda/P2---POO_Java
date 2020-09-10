package Aniversario;

public class PessoaInvalidaException extends Exception {

	public PessoaInvalidaException() {
		super("Não consta na lista");
	}
}
