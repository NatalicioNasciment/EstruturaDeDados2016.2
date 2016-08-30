package lista01;
public class Veiculos {
	private static final int CAPACIDADE_LIMITE = 20000;// a unidade de medida adotada é KG
	private static final int LIMITE_TEMPO = 6;// a unidade de tempo é a HORA.
	private String marca;
	private String modelo;
	private int ano;
	private float capacidade;
	private int tempo;
	private int numVisitas;
	
	public Veiculos() {
	}

	public Veiculos(String marca, String modelo, int ano) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
	}
	
	public Veiculos(float capacidade, int tempo, int numVisitas) {
		this.setCapacidade(capacidade);
		this.setTempo(tempo);
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
		if (capacidade <= CAPACIDADE_LIMITE) {
			return capacidade;
		} else {
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
		if( (tempo) * numVisitas <= 24){
			return numVisitas;
		}else{
			return -1;
		}
	}

	public void setNumVisitas(int numVisitas) {
		this.numVisitas = numVisitas;
	}
}
