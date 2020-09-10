package mortalKombat;

public class SubZero extends Lutador {

	public SubZero() {
		super("SubZero");
	}
	
	@Override
	public void lancarMagia(Lutador oponente) {
		super.lancarMagia(oponente);
		oponente.vida -= 8;
	}
}
