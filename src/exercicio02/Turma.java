package exercicio02;

public class Turma {
	private String turma;
	private Aluno aluno[];
	private static float mediaTurma = 0;
	
	public Turma(){}
	public Turma(String turma){
		this.setTurma(turma);
	}
	
	public void setTurma(String turma){
		this.turma = turma;
	}
	public String getTurma(){
		return turma;
	}
	
	
	public void setMediaTurma(Aluno aluno[], String turma){
		for(int i = 0; i < aluno.length; i++){
			mediaTurma = mediaTurma + this.aluno[i].getMediaAluno();
		}
	}
	
	public float getMediaTurma(){
		return mediaTurma / aluno.length;
	}
}
