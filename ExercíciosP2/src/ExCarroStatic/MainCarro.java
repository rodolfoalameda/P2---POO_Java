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
		
		
		
		//Professor, aqui n�o instanciei o restante dos carros porque entendi a l�gica do Static. Em seguida respondo a Q2 e Q3.
		//Quando eu crio a variavel de classe, eu posso setar para que todos os meus carros criados entrem em promo��o, ou n�o.
		//� como se o dono da loja estivesse colocando toda seu estoque em promo��o, alem claro da vantagem de voc� chamar atrav�s 
		//diretamente da classe, n�o precisando chamar por um objeto instanciado, por ex, case1.promocao. Na pr�tica isso muda porque 
		//o dono da loja poderia escolher qual carro estaria individualmente na promo��o se fosse uma variavel de instancia, e se for 
		// uma variavel de classe, ele poderia setar para toda sua loja entrar em promocao, ou n�o.

		
	}
}
