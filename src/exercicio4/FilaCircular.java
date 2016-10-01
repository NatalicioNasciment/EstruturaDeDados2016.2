package exercicio4;

public class FilaCircular<T> {
	private T[] itens;
	private int frente;
	private int tras;
	private int tam;

	public FilaCircular(int tam) {
		this.itens = (T[]) new Object[this.tam = tam];
		this.frente = 0;
		this.tras = 0;
	}
	
	public void enfilerar(T item) throws Exception{
		if(cheia()){
			throw new Exception("A lista está cheia!!!");
		}
		this.itens[tras] = item;
		this.tras = (tras + 1) % tam;
	}
	
	public void desenfilerar() throws Exception{
		if(vazia()){
			throw new Exception("Fila vazia!!!");
		}else{
			T item =  itens[this.frente];
			this.frente = (this.frente + 1) % tam;
			this.itens[this.tras -1] = null;
		}
	}
	
	public void listar(){
		for(int i = 0; i < this.tam; i++){
			if(itens[i] != null){
				System.out.println(itens[i]);
			}
		}
	}
	
	public int quantElemento(){
		return 0;
	}
	
	private T redimensionar(){
		T novosItens = (T)new Object[2 * tam];
		if(this.tras + 1 ==  this.tam){
			
		}
		return null;
	}
	
	public boolean vazia(){
		return this.frente == this.tras;
	}
	public boolean cheia(){
		return (this.tras + 1) % tam == this.frente;
	}
	
	public int getTam(){
		return this.tam;
	}

}
