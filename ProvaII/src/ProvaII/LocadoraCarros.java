package ProvaII;

import java.util.List;

public interface LocadoraCarros {

	public void adicionarCarro(String modelo, String marca, int ano, double diaria);
	public List<Carro> listarCarrosDaMarca(String marca);
	public void removerCarro(String modelo, String marca, int ano) throws CarroInexistenteException;
	public double alugarCarro(String string, Data dataInicio, Data dataFim) throws CarroAlugadoException;
}
