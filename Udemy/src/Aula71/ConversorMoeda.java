package Aula71;

public class ConversorMoeda {

	public double precoDolar;
	public static double iof = 1.06;
	public double compraDolar;
	
	ConversorMoeda(){
		
	}
	
public double conversor() {
		return (precoDolar * compraDolar) * iof;
	}
}

