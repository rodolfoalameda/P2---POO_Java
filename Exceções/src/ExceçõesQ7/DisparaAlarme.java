package ExceçõesQ7;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class DisparaAlarme {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.print("Digite a hora do alarme: ");
			int hora = teclado.nextInt();
			System.out.print("Digite o minuto do alarme: ");
			int minuto = teclado.nextInt();
		}

		catch (HoraInvalidaException e) {
			System.out.println(e.getMessage());
		}

		catch (MinutoInvalidaException e) {
			System.out.println(e.getMessage());
		}

		Alarme alarme;
		try {
			alarme = new Alarme(hora, minuto);
			while (!alarme.isAgora()) {
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			System.out.println("Alarme disparado");
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		teclado.close();

	}
}