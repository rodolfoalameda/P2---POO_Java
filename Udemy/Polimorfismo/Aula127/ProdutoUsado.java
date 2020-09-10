package Aula127;

public class ProdutoUsado extends Produto {

	private short dataDeFabricacao;

	public ProdutoUsado() {

	}

	public ProdutoUsado(String nome, Double preco, short dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public short getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricacao(short dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public double etiqueta() {
		return super.etiqueta();
	}

}
