package Aula126;

public class Terceirizado extends Empregado {

	private double taxaAdicional;

	public Terceirizado() {

	}

	public Terceirizado(String nome, int horaTrabalhada, double valorPorHora, double taxaAdicional) {
		super(nome, horaTrabalhada, valorPorHora);
		this.taxaAdicional = taxaAdicional;
	}

	public double getTaxaAdicional() {
		return taxaAdicional;
	}

	public void setTaxaAdicional(double taxaAdicional) {
		this.taxaAdicional = taxaAdicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + taxaAdicional * 1.1;
	}

}
