package exercicio4;

public class FilaCircular<T> {
	private T[] itens;
	private int frente;
	private int tras;
	private int tam;

	public FilaCircular(int tam) {
		this.itens = (T[]) new Object[this.tam];
		this.frente = 0;
		this.tras = 0;
	}
	
	public void enfilerar(T item) throws Exception{
		if(vazia()){
			this.tras++;
			this.itens[frente] = item;
		}
		if(((this.tras + 1) % tam) == this.frente){
			throw new Exception("A lista está cheia!!!");
		}
		this.itens[tras] = item;
		this.tras = (tras + 1) % tam;
	}
	
	public boolean desenfilerar(){
		return false;
	}
	public boolean vazia(){
		return frente == tras;
	}

}
