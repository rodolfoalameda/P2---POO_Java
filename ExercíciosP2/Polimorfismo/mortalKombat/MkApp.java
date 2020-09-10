package mortalKombat;

public class MkApp {

	public static void main(String[] args) {

		Lutador subzero = new SubZero();
		Lutador rayden = new Rayden();

		MortalKombat mortalKombat = new MortalKombat(subzero, rayden);
		mortalKombat.fight();

	}

}
