package mortalKombat;

public class NightWolf extends Lutador {

	public NightWolf() {
		super("NightWolf");
	}
	
	@Override
	public void atirar(Lutador oponente) {
		super.atirar(oponente);
		oponente.vida -= 5;
	}
	
	@Override
	public void lancarMagia(Lutador oponente) {
		super.lancarMagia(oponente);
		oponente.vida -= 6;
	}
	
}
