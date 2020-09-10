package Aula89;

public class AluguelQuarto {

	String nome, email;

	AluguelQuarto(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String toString() {
		String output = "";
		output += "Nome: " + nome + "\n";
		output += "Email: " + email + "\n";
		return output;
	}

}
