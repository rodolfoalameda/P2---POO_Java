package Aniversario;

public class Main {

	public static void main(String[] args) throws MesInvalidoException, PessoaInvalidaException {

//		try {
//			MinhaAgendadeAniversarios agenda = new MinhaAgendadeAniversarios();
//			Aniversariante a1 = new Aniversariante("João", new Data(5, 29));
//			agenda.adicionarAniversariante(a1);
//		} catch (MesInvalidoException e) {
//			System.out.println(e.getMessage());
//		}
//

//		Aniversariante a3 = new Aniversariante("Eudo", new Data(6, 1));
//
//		MinhaAgendadeAniversarios agenda = new MinhaAgendadeAniversarios();
//
//		agenda.adicionarAniversariante(a1);
//		agenda.adicionarAniversariante(a2);
//		agenda.adicionarAniversariante(a3);
//		a1.ehAniversariantedoMes(2);
//		System.out.println(agenda.obterAniversarianteDoMes(2));
//		System.out.println(agenda.obterAniversarianteDoMes(12));
//
//		agenda.removerAniversariante("João");
//
//		agenda.imprimeLista();
//
//		try {
//			Aniversariante a2 = new Aniversariante("Maria", new Data(1, 12));
//			MinhaAgendadeAniversarios agenda = new MinhaAgendadeAniversarios();
//			agenda.adicionarAniversariante(a2);
//			agenda.removerAniversariante("Mari");
//		} catch (PessoaInvalidaException e) {
//			System.out.println(e.getMessage());
//		}

		Aniversariante a1 = new Aniversariante("João", new Data(5, 2));
		Aniversariante a2 = new Aniversariante("Jo", new Data(1, 2));
		MinhaAgendadeAniversarios agenda = new MinhaAgendadeAniversarios();
		agenda.adicionarAniversariante(a1);
		agenda.adicionarAniversariante(a2);
		System.out.println(agenda.imprimeLista());
		
		
	}

}
