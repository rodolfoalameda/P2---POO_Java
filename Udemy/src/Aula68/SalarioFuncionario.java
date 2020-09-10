package Aula68;

public class SalarioFuncionario {

	String nome;
	double salarioBruto;
	double imposto;

	SalarioFuncionario() {

	}

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public void aumentoSalario(double taxa) {
		salarioBruto += salarioBruto * (taxa / 100);
	}

	public String toString() {
		String output = "";
		output += "Nome: " + nome + "\n";
		output += "Salario Bruto: " + salarioBruto + "\n";
		output += "Taxa: " + imposto + "\n" ;
		output += "Salario Liquido: " + salarioLiquido();
		return output;
	}

}
