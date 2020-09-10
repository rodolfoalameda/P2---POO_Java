package mortalKombat;

public class LiuKang extends Lutador {

	public LiuKang() {
		super("LiuKang");
	}

	@Override
	public void chutar(Lutador oponente) {
		super.chutar(oponente);
		oponente.vida -= 9;

	}

	@Override
	public void lancarMagia(Lutador oponente) {
		super.lancarMagia(oponente);
		oponente.vida -= 9;
	}

}
