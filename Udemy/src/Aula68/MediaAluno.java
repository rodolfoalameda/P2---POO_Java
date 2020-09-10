package Aula68;

public class MediaAluno {

	public String nome;
	public double nota1, nota2, nota3;

	public MediaAluno() {

	}

	public void aprovaAluno() {
		int media = 60;
		double notaTotal = nota1 + nota2 + nota3;

		if (notaTotal < 60) {
			System.out.println("Nota Final: " + notaTotal);
			System.out.println("Reprovado, faltam: " + (media - notaTotal));
		} else {
			System.out.println("Nota Final: " + notaTotal);
			System.out.println("Aprovado");
		}

	}

	public String toString() {
		String output = "";
		output += "Nome: " + nome + "\n";
		output += "Nota1: " + nota1 + "\n";
		output += "Nota2: " + nota2 + "\n";
		output += "Nota3: " + nota3 + "\n";
		return output;
	}
	
}
