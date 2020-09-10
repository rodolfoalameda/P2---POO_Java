package Teste;

import java.util.ArrayList;
import java.util.List;

public class LojaDeCarro {

	public List <Carro> vitrine;

	public LojaDeCarro() {
		vitrine = new ArrayList<Carro>();
	}
	
	public void adcionaCarro(Carro carro) {
		vitrine.add(carro);
	}
	
	
}
