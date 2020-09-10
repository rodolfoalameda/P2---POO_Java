package ProvaII;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Locadora implements LocadoraCarros {

	protected List<Carro> locadora;

	public Locadora() {
		super();
		locadora = new ArrayList<Carro>();
	}

	@Override
	public void adicionarCarro(String modelo, String marca, int ano, double diaria) {
		Carro c = new Carro(modelo, marca, ano, diaria);
		locadora.add(c);

	}

	@Override
	public List<Carro> listarCarrosDaMarca(String marca) {
		List<Carro> nomeMarca = new ArrayList<Carro>();
		for (int i = 0; i < locadora.size(); i++) {
			if (marca.equals(locadora.get(i).getMarca())) {
				nomeMarca.add(locadora.get(i));
			}
		}
		return nomeMarca;
	}

	@Override
	public void removerCarro(String modelo, String marca, int ano) throws CarroInexistenteException {
		Iterator<Carro> it = this.locadora.iterator();
		boolean exception = false;
		while (it.hasNext()) {
			Carro c = it.next();
			if (c.getModelo().equals(modelo) && c.getMarca().equals(marca) && c.getAno() == ano) {
				it.remove();
				exception = true;
			}
		}
		if (exception == false) {
			throw new CarroInexistenteException();
		}
	}

	public ArrayList<String> getCarro() {
		ArrayList<String> listaCompleta = new ArrayList<String>();
		for (Carro c : locadora) {
			listaCompleta.add(c.getModelo() + "" + c.getMarca() + "" + c.getAno());
		}
		return listaCompleta;
	}

	public int tamanhoLista() {
		return locadora.size();
	}

}
