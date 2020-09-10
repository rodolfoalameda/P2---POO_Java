package ExRetangulo;

public class MainRetangulo {
	public static void main(String[] args) {

		Retangulo novoRetangulo = new Retangulo(10, 20);

		System.out.println("O perimetro desse retangulo vale: " + novoRetangulo.getPerimetro());
		System.out.println("A área desse retangulo vale: " + novoRetangulo.getArea());
		System.out.println(novoRetangulo.toString());
		System.out.println("A largura deste retangulo vale: " + novoRetangulo.getLargura());
		System.out.println("A altura deste retangulo vale: " + novoRetangulo.getAltura());
		
		novoRetangulo.setAltura(25);
		novoRetangulo.setLargura(120);
	}

}
