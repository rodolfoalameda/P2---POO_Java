package ExCarroStatic;

public class MainCarro {
	public static void main(String[] args) {
		
		//Carro.promocao = false;
		Carro.promocao = true;
		
		Carro case1 = new Carro("palio", "fiat","branco", 35000);
		System.out.print(case1);
		System.out.println(case1.calculaPreco() + "\n" );
		
		Carro case2 = new Carro("palio", "fiat", "prateado", 35000 );
		System.out.print(case2);
		System.out.println(case2.calculaPreco() + "\n" );
		
		Carro case3 = new Carro("civic", "honda", "preto", 4, true, true, true, true, 110000);
		System.out.print(case3);
		System.out.print(case3.calculaPreco());
		
		
		
		//Professor, aqui não instanciei o restante dos carros porque entendi a lógica do Static. Em seguida respondo a Q2 e Q3.
		//Quando eu crio a variavel de classe, eu posso setar para que todos os meus carros criados entrem em promoção, ou não.
		//É como se o dono da loja estivesse colocando toda seu estoque em promoção, alem claro da vantagem de você chamar através 
		//diretamente da classe, não precisando chamar por um objeto instanciado, por ex, case1.promocao. Na prática isso muda porque 
		//o dono da loja poderia escolher qual carro estaria individualmente na promoção se fosse uma variavel de instancia, e se for 
		// uma variavel de classe, ele poderia setar para toda sua loja entrar em promocao, ou não.

		
	}
}
