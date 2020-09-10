package ExListas;

import java.util.ArrayList;
import java.util.List;

public class SistemaInterpol {

	List<String> procurados = new ArrayList<String>();

	public void adicionarProcurados(String nome) {
		procurados.add(nome);
	}

	public boolean ehProcurado(String nome) {
		for (int i = 0; i < procurados.size(); i++) {
			if (nome == procurados.get(i)) {
				return true;
			}
		}
		return false;
	}

}
