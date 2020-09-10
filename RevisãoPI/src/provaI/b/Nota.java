package provaI.b;

public class Nota {

	String conteudo, autor;
	Data criacao;

	public Nota(String conteudo, String autor, Data criacao) {

		this.conteudo = conteudo;
		this.autor = autor;
		this.criacao = criacao;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Data getCriacao() {
		return criacao;
	}

	public void setCriacao(Data criacao) {
		this.criacao = criacao;
	}

	public String toString() {
		String output = "";
		output += "Autor: " + getAutor() + "\n";
		output += "Conteudo: " + getConteudo() + "\n";
		output += "Data: " + criacao.getDia() + "/" + criacao.getMes() + "/" + criacao.getAno();
		return output;
	}

}
