package ExImc;

public class HumanoImc {

	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;

	public HumanoImc(String nome, int idade, double altura, double peso, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}

	public void calculaImc(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
		double imc = peso / (altura * altura);
		if (imc <= 18.5) {
			System.out.println("Abaixo do peso normal, seu imc vale: " + imc);
		} else if (imc > 18.5 && imc <= 25) {
			System.out.println("Peso normal, seu imc vale: " + imc);
		} else if (imc > 25 && imc <= 30) {
			System.out.println("Acima do peso normal, seu imc vale: ");
		} else {
			System.out.println("Obeso, seu imc vale: " + imc);
		}
	}

	public String toString() {
		return "Nome: " + nome + ", Idade " + idade + ", Altura " + altura + ", Peso " + peso + ", Sexo " + sexo;
	}

}