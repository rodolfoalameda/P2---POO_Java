package Aniversario;

public class Aniversariante {

	private String nome;
	private Data data;

	public Aniversariante(String nome, Data data) {

		this.nome = nome;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public boolean ehAniversariantedoMes(int mes) {
		if (this.getData().getMes() != mes) {
			System.out.println("false");
		}
		return true;
	}

	public String toString() {
		String output = "";
			   output += getNome() + ": " + getData().getDia() + "/" + getData().getMes();
		return output;
	}

}
