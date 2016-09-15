package exercicio3;

public class Celula {
	private Object elemento;
	private Celula prox;

	public Celula(Celula primeira, Object elemento) {
		this.prox = primeira;
		this.elemento = elemento;
	}

	public Celula(Object elemento) {
		this.elemento = elemento;
	}

	public Celula() {
		// TODO Auto-generated constructor stub
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Celula getProx() {
		return prox;
	}

	public void setProx(Celula prox) {
		this.prox = prox;
	}

}
