package ExImovel;

public class Imovel {

	String tipo, imobiliaria;
	int pavimentos, pavimento, quartos, suites, banheiros, metrosQuadrados;
	boolean elevador, piscina, quadra;
	double precoFinal;

	public Imovel(String tipo, String imobiliaria, int quartos, int suites, int banheiros, int metrosQuadrados,
			boolean piscina, boolean quadra) {
		this.tipo = tipo;
		this.imobiliaria = imobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
	}

	public Imovel(String tipo, String imobiliaria, int pavimento, int quartos, int suites, int banheiros, int metrosQuadrados,
			boolean elevador, boolean piscina, boolean quadra) {
		this.tipo = tipo;
		this.imobiliaria = imobiliaria;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;

	}

	public double calculaPreco() {

		if (tipo == "casa") {
			precoFinal = metrosQuadrados * 5000;
		}

		else {
			precoFinal = metrosQuadrados * 5000;
			int contador = 1;
			while (contador <= pavimento) {
				if (contador >= 5) {
					precoFinal += 2000;
				}
				contador++;
			}
			
			if (elevador == true) {
				precoFinal += 2500;
			}

			if (piscina == true) {
				precoFinal += 2500;
			}

			if (quadra == true) {
				precoFinal += 2500;
			}
		}
		
		return precoFinal;

	}

	public String toString() {
		String output = "";

		output += "tipo " + tipo + "\n";
		output += "imobiliaria " + imobiliaria + "\n";
		output += "quartos " + quartos + "\n";
		output += "suites " + suites + "\n";
		output += "banheiros " + banheiros + "\n";
		output += "elevador " + elevador + "\n";
		output += "piscina " + piscina + "\n";
		output += "quadra " + quadra + "\n";
		output += "precoFinal " + precoFinal + "\n";

		if (tipo == "apartamento") {
			output += "pavimento " + pavimento;
			
		}
		return output;
	}

}
