package exercicio02;

public class Turma {
	private String turma;
	private int tamTurma;
	private static float mediaTurma = 0;
	
	public Turma(){}
	public Turma(String turma){
		this.setTurma(turma);
	}
	public Turma(int capacidade){
		this.tamTurma = capacidade;
	}	
	public void setTurma(String turma){
		this.turma = turma;
	} 
	public String getTurma(){
		return turma;
	}
	public void setMediaTurma(Aluno aluno[]){
		for(int i = 0; i < tamTurma; i++){
			mediaTurma = mediaTurma + aluno[i].getMediaAluno();
		}
	}
	
	public float getMediaTurma(){
		return mediaTurma ;
	}
}
