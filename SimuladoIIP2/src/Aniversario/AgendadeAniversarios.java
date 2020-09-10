package Aniversario;

import java.util.ArrayList;

public interface AgendadeAniversarios {

	public void adicionarAniversariante(Aniversariante a);
	public ArrayList<String> obterAniversarianteDoMes(int mes);
	public void removerAniversariante(String nome) throws PessoaInvalidaException;
	public ArrayList<String> imprimeLista();
	public int getTamanho();
}
