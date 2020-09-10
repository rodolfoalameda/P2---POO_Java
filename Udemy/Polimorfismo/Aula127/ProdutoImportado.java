package Aula127;

public class ProdutoImportado extends Produto {

	protected Double taxa;

	public ProdutoImportado() {

	}

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	@Override
	public double etiqueta() {
		return super.etiqueta();
	}

	public double precoTotal() {
		double precoTotal = super.etiqueta() * taxa;
		return precoTotal;
	}

}
