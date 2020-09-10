package Aula65;

import java.util.Scanner;

public class MainProduto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Produto produto1 = new Produto("tv", 900, 10);
		
		System.out.println(produto1);

		System.out.print("Deseja adcionar quantos produtos? ");
		int quantidade = input.nextInt();
		produto1.addProduto(quantidade);

		System.out.println("Produto atualizado: " + produto1);

		System.out.print("Deseja remover quantos produtos: ");
		quantidade = input.nextInt();
		produto1.removeProduto(quantidade);
		
		System.out.println("Produto atualizado: " + produto1);
		
		
	}
}
