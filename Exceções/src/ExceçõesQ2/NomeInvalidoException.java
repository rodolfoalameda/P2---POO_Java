package Exce��esQ2;

public class NomeInvalidoException extends Exception {

	NomeInvalidoException (String nome){
		super("O nome fornecido n�o pode ser nulo ou vazio");
	}
	
}
