package ExceçõesQ2;

public class NomeInvalidoException extends Exception {

	NomeInvalidoException (String nome){
		super("O nome fornecido não pode ser nulo ou vazio");
	}
	
}
