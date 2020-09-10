package ExceçõesQ3;

public class DataInvalidaException extends Exception {

	public DataInvalidaException(int dia, int mes, int ano){
		super("Os parâmentros fornecidos não represntam uma data valida");
	}
}
 