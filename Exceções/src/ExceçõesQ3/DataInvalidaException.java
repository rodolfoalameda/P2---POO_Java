package Exce��esQ3;

public class DataInvalidaException extends Exception {

	public DataInvalidaException(int dia, int mes, int ano){
		super("Os par�mentros fornecidos n�o represntam uma data valida");
	}
}
 