package Aula68;

import java.util.Scanner;

public class MainMediaAluno {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		MediaAluno aluno = new MediaAluno();
		
		System.out.print("Aluno: ");
		aluno.nome = input.nextLine();
		System.out.print("Informe a primeira nota: ");
		aluno.nota1 = input.nextDouble();
		System.out.print("Informe a segunda nota: ");
		aluno.nota2 = input.nextDouble();
		System.out.print("Informe a terceira nota: ");
		aluno.nota3 = input.nextDouble();
		
		System.out.println(aluno);
		aluno.aprovaAluno();
	}
}
