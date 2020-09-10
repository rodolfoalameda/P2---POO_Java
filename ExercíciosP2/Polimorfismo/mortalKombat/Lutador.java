package mortalKombat;

public class Lutador {

	protected String nome;
	protected int vida;

	public Lutador() {

	}

	public Lutador(String nome) {

		this.nome = nome;
		this.vida = 100;
	}

	public String getNome() {
		return nome;
	}

	public int getVida() {
		return vida;
	}

	public String toString() {
		return "Lutador: " + nome + "Vida: " + vida;
	}

	public void socar(Lutador oponente) {
		System.out.println(nome + " deu um murro em: " + oponente.nome);
		oponente.vida -= 7;
		System.out.println(oponente.nome + " esta com: " + oponente.getVida() + " de vida");
	}

	public void chutar(Lutador oponente) {
		System.out.println(nome + " deu um chute em: " + oponente.nome);
		oponente.vida -= 5;
		System.out.println(oponente.nome + " esta com: " + oponente.getVida() + " de vida");
	}

	public void atirar(Lutador oponente) {
		System.out.println(nome + " deu um tiro em: " + oponente.nome);
		oponente.vida -= 10;
		System.out.println(oponente.nome + " esta com: " + oponente.getVida() + " de vida");
	}

	public void lancarMagia(Lutador oponente) {
		System.out.println(nome + " deu uma magia em: " + oponente.nome);
		oponente.vida -= 12;
		System.out.println(oponente.nome + " esta com: " + oponente.getVida() + " de vida");
	}

}
