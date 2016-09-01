package exercicio1;

public class TesteMediaTurma {
	
	public static void main(String[] args) {		
		Aluno natal = new Aluno();
		natal.setNotas(10, 8, 7);
		
		Aluno natal1 = new Aluno();
		natal.setNotas(10, 8, 7);
		
		Aluno natal2 = new Aluno();
		natal.setNotas(10, 8, 7);
		 
		Aluno natal3 = new Aluno();
		natal.setNotas(10, 8, 7);
		
		Turma a = new Turma(4);
		Aluno aluno[] = {natal, natal1, natal2, natal3};
		a.setMediaTurma(aluno);
		a.setTurma("A");
		System.out.println("A media da  turma "+ a.getTurma()+ " é : "+ a.getMediaTurma());
		
		
	}

}
