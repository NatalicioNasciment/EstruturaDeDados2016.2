package exercicio3;

public class Celula<T> {
	private T elemento;
	private Celula prox;
	private Celula anterior;

	public Celula(Celula primeira, T elemento) {
		this.prox = primeira;
		this.elemento = elemento;
	}

	public Celula(T elemento) {
		this.elemento = elemento;
	}

	public Celula() {
		// TODO Auto-generated constructor stub
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public Celula getProx() {
		return prox;
	}

	public void setProx(Celula prox) {
		this.prox = prox;
	}
	
	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

}
