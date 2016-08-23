package exercicio03;
/*
 * Faça um TAD para representar veículos com a finalidade de realizar transporte de
carga em zonas urbanas. Estes veículos tem capacidade limitada, limite de tempo
de operação, número de visitas que é capaz de realizar em um dia e atributos
como: marca, modelo, ano, etc.
 * */

public class Veiculos {
	//a unidade de medida adotada é KG
	private static final int CAPACIDADELIMITE = 20000;
	//a unidade de tempo é a HORA. 
	private static final int LIMITETEMPO = 1;
	private String marca;
	private String modelo;
	private int ano;
	private float capacidade;
	private int tempo;
	private int numVisitas;
	
	public Veiculos(){}
	public Veiculos(String marca, String modelo, int ano){
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);		
	}
	public Veiculos(float capacidade, int limiteTempo, int numVisitas){
		this.setCapacidade(capacidade);
		this.setTempo(limiteTempo);
		this.setNumVisitas(numVisitas);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public float getCapacidade() {
		
		if (capacidade <= CAPACIDADELIMITE) {
			return capacidade;
		}else{
			return -1;
		}
	}
	public void setCapacidade(float capacidade) {
		this.capacidade = capacidade;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public int getNumVisitas() {
		return numVisitas;
	}
	public void setNumVisitas(int numVisitas) {
		this.numVisitas = numVisitas;
	}
}
