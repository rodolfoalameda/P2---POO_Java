package Aniversario;

public class Data {

	private int dia, mes;

	public Data(int dia, int mes) throws MesInvalidoException {

		if (mes < 1 || mes > 12) {
			throw new MesInvalidoException();
		} else {
			this.dia = dia;
			this.mes = mes;
		}

	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String toString() {
		String output = "";
		output += this.getDia() + "/" + this.getMes();
		return output;

	}

}
