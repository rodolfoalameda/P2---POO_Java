package provaI.a;

import java.util.ArrayList;
import java.util.List;

public class Gmail {

	private Email[] emails;
	int tamanho = 0;

	public Gmail() {
		emails = new Email[10];
	}

	public void adicionarEmail(Email e) {
		emails[tamanho] = e;
		tamanho++;
		if (emails.length > 10) {
			duplicaArray();
		}
	}

	public void duplicaArray() {
		Email[] auxiliar = new Email[tamanho * 2];
		for (int i = 0; i < emails.length; i++) {
			auxiliar[i] = emails[i];
		}
		emails = auxiliar;
	}

	public void enviarEmail(Email e) {

	}

	public void enviarEmail(String conteudo, String remetente, String destinatario, Data envio) {
		Email e = new Email(conteudo, remetente, destinatario, envio);
		enviarEmail(e);
	}

	public int getQntdeEmails() {
		return emails.length;
	}

	public List<Email> getEmailRemetente(String remetente) {
		List<Email> lista = new ArrayList<Email>();
		for (int i = 0; i < emails.length; i++) {
			if (this.emails[i].getRemetente().equals(remetente)) {
				lista.add(emails[i]);
			}
		}
		return lista;
	}

	public List<Email> getEmailsComPalavra(String palavra) {
		List<Email> lista = new ArrayList<Email>();
		for (int i = 0; i < emails.length; i++) {
			if (this.emails[i].getConteudo().contains(palavra)) {
				lista.add(emails[i]);
			}
		}
		return lista;
	}

//	public void removeEmail(String remetente) {
//		for(int i = 0; i < emails.length; i ++) {
//			if(this.emails[i].getDestinatario().equals(remetente)) {
//				for(int j = i; j < emails.length - 1; j++) {
//					emails[j] = emails[j+1];
//				}
//			} tamanho --; 
//		}
//	}
//	

}
