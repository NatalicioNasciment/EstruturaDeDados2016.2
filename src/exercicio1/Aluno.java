package exercicio1;
public class Aluno {
	private String nome;
	private int matricula;
	private float p1;
	private float p2;
	private float p3;

	public Aluno() {
	}

	public Aluno(String nome, int matricula) {
		this.setNome(nome);
		this.setMatricula(matricula);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setNotas(float p1, float p2, float p3){
		this.p1 = p1 ;
		this.p2 = p2 ;
		this.p3 = p3 ;
	} 
	
	public float getMediaAluno(){
		return (p1 + p2 + p3) / 3;  
	}
}
