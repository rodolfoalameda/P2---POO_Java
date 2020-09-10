package ExStrings;

import java.util.Arrays;

public class StringUtils {

	public static String formataAtributo(String atributo) {

		String novoAtributo;
		String[] valor = atributo.split(" ");

		String output = valor[0];
		for (int i = 1; i < valor.length; i++) {
			output += valor[i].substring(0, 1).toUpperCase().concat(valor[i].substring(1));
		}

		novoAtributo = output;
		return novoAtributo;
	}

	public static String formataMetodo(String metodo) {

		String novoAtributo;
		String[] valor = metodo.split(" ");

		String output = valor[0];
		for (int i = 1; i < valor.length; i++) {
			output += valor[i].substring(0, 1).toUpperCase().concat(valor[i].substring(1));
		}

		novoAtributo = output;
		return novoAtributo;
	}

	public static String formataClasse(String classe) {
		String novaClasse;
		String[] valor = classe.split(" ");

		String output = "";
		for (int i = 0; i < valor.length; i++) {
			output += valor[i].substring(0, 1).toUpperCase().concat(valor[i].substring(1));
		}

		novaClasse = output;
		return novaClasse;
	}

	public static String ordenaStrings(String palavra1, String palavra2) {

		String palavraOrdenada;

		String palavras[] = new String[2];

		palavras[0] = palavra1;
		palavras[1] = palavra2;
		Arrays.sort(palavras);

		String saida = palavras[0] + " " + palavras[1];

		palavraOrdenada = saida;
		return palavraOrdenada;
	}

	public static boolean ehPalindromo(String palavra) {

		String palavraInicial = palavra;
		int tamanho = palavra.length() - 1;
		String palindromo = "";

		for (int i = tamanho; i >= 0; i--) {
			palindromo += palavraInicial.charAt(i);
		}

		if (palavraInicial.equalsIgnoreCase(palindromo)) {
			return true;
		} else {
			return false;
		}

	}

	public static String transformaParaCaixaAlta(String frase) {

		String novaFrase;
		novaFrase = frase.toUpperCase();
		return novaFrase;

	}

	public static int contaVogais(String frase) {

		int contador = 0;

		if (frase.toLowerCase().contains("a")) {
			contador += 1;
		}

		if (frase.toLowerCase().contains("e")) {
			contador += 1;
		}

		if (frase.toLowerCase().contains("i")) {
			contador += 1;
		}

		if (frase.toLowerCase().contains("o")) {
			contador += 1;
		}

		if (frase.toLowerCase().contains("u")) {
			contador += 1;
		}

		return contador;
	}

	public static String removeEspacosSuperfluos(String frase) {
		String espaco;
		espaco = frase.trim();

		return espaco;
	}

	public static int binarioPraDecimal(String binario) {
		int decimal;
		String num = binario;
		int valor = num.length()-1;
		int soma = 0;
		int potencia = 0;
		for(int i = valor; i >= 0 ; i--) {
			
			if(num.charAt(i) == '1') {
				soma+= Math.pow(2, potencia);	
			}
			else {
				soma+=0;
			}
			potencia+=1;
		}
		decimal = soma;
		return decimal;
	}

	public static int getQtdadePalavras(String frase) {
		
		int quantidade;
		
		String [] tamanho = frase.split(" ");		
		quantidade = tamanho.length;
		
		return quantidade;
		
	}

}

//	Bem, tecnicamente não a diferença nenhuma na criação. Uma forma é mais rapida que a outra, deve-se atentar no entanto que 
//	essas strings serão objetos diferentes.
	
//	Toda vez que uma string é alterada, é criado um novo objeto. O antigo sera removido pelo garbage collector.
	
//	O string buider iria ajudar porque nenhum objeto novo seria criado, isso não iria alocar novos elementos na memoria tornando o desempenho melhor.
	
	
	
	
	
	
	
	

