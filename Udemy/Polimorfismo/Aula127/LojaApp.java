package Aula127;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LojaApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		List<Produto> produtos = new ArrayList<>();

		System.out.print("Entre com o numero de produtos: ");
		int k = input.nextInt();

		for (int i = 1; i <= k; i++) {
			System.out.println("Comum, usado ou importado?: (c/u/i)");
			char a = input.next().charAt(0);

			System.out.println("Nome: ");
			input.nextLine();
			String nome = input.nextLine();
			
			System.out.println("Preço: ");
			double preco = input.nextDouble();
			
			if (a == 'u') {
				System.out.println("Ano de fabricação: ");
				short dataDeFabricacao = input.nextShort();
				Produto prod = new ProdutoUsado(nome, preco, dataDeFabricacao);
				produtos.add(prod);
			} else if (a == 'i') {
				System.out.println("Taxa de importação: ");
				double taxa = input.nextDouble();
				Produto prod = new ProdutoImportado(nome, preco, taxa);
				produtos.add(prod);
			} else {
				Produto prod = new Produto(nome, preco);
				produtos.add(prod);
			}
		}

		System.out.println();

		System.out.println("Etiquetas de preço: ");

		for (Produto prod : produtos) {
			System.out.println(prod.etiqueta());
		}
	}

}
