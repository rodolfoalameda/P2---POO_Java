package mortalKombat;

import java.util.Random;

public class MortalKombat {

	public Lutador p1, p2;

	public MortalKombat(Lutador p1, Lutador p2) {

		this.p1 = p1;
		this.p2 = p2;
	}

	public void fight() {

		while (p1.vida > 0 && p2.vida > 0) {

			Lutador atacante = p1;
			Lutador defensor = p2;
			Random r1 = new Random();
			int sorteio = r1.nextInt(2);

			if (sorteio == 0) {
				atacante = p1;
				defensor = p2;
			} else {
				atacante = p2;
				defensor = p1;
			}

			int sorteioGolpe = r1.nextInt(4);

			if (sorteioGolpe == 0) {
				atacante.socar(defensor);
			} else if (sorteioGolpe == 1) {
				atacante.chutar(defensor);
			} else if (sorteioGolpe == 2) {
				atacante.atirar(defensor);
			} else {
				atacante.lancarMagia(defensor);
			}

		}

		System.out.println();

		if (p1.vida <= 0) {
			System.out.println(p2.getNome() + " Venceu");
		} else {
			System.out.println(p1.getNome() + " Venceu");
		}

	}

}
