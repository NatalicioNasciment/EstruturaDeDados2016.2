package exercicio02;

public class TesteMediaTurma {

	public static void main(String[] args) {
		Aluno natal = new Aluno();
		natal.setNotas(10, 9, 8);
		
		Aluno liano = new Aluno();
		liano.setNotas(10, 9, 8);
		
		Aluno licio = new Aluno();
		licio.setNotas(10, 9, 8);
		
		Turma a = new Turma();
//		System.out.println("A media do aluno é  " + natal.getMediaAluno());
		System.out.println(a.getMediaTurma());
	}

}
