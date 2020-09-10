
public class ProfessorApp {
	public static void main(String[] args) {
		
		Professor professor = new Professor();
		professor.nome = "Eduardo";
		professor.matricula = 25987;
		professor.cpf = "08549872156";
		
		System.out.println(professor.nome);
		System.out.println(professor.matricula);
		System.out.println(professor.cpf);
		
	}
}
