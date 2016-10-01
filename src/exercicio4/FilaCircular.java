package exercicio4;

public class FilaCircular<T> {
	private T[] itens;
	private int frente;
	private int tras;
	private int tam;
	private T[] novosItens;

	public FilaCircular(int tam) {
		this.itens = (T[]) new Object[this.tam = tam];
		this.frente = 0;
		this.tras = 0;
	}

	public void enfilerar(T item) throws Exception {
		redimensionar();
		this.itens[tras] = item;
		this.tras = (tras + 1) % tam;
	}
/*
	public void desenfilerar() throws Exception {
		if (vazia()) {
			throw new Exception("Fila vazia!!!");
		} else {
			T item = itens[this.frente];
			this.frente = (this.frente + 1) % tam;
			this.itens[this.tras - 1] = null;
		}
	}
	*/
	
	public T desenfilerar() throws Exception {
		if (vazia()) {
			throw new Exception("Fila vazia!!!");
		} else {
			T item = itens[this.frente];
			this.itens[this.frente] = null;
			this.frente = (this.frente + 1) % tam;
			return item;
		}
	}

	public void listar() {
		for (int i = 0; i < this.tam; i++) {
			if (itens[i] != null) {
				System.out.print("[" + itens[i] + "]");
			}
		}
	}

	public int quantElemento() {
		int cont = 0;
		if (this.tras > this.frente) {
			for (int i = this.frente; this.frente <= this.tras; this.frente++) {
				cont++;

			}
			return cont;
		} else {
			for (int i = this.tras; this.tras <= this.frente; i++) {
				cont++;

			}
			return cont;
		}
	}

	private void redimensionar() {

		if (this.tras + 1 == this.tam) {
			novosItens = (T[]) new Object[2 * tam];
			for (int i = 0; i < this.tam; i++) {
				this.novosItens[i] = itens[(this.frente + i) % tam];
			}
			itens = novosItens;
			this.frente = 0;
			this.tras = quantElemento();
			this.tam = 2 * this.tam;
		}
	}

	public boolean vazia() {
		return this.frente == this.tras;
	}

	public boolean cheia() {
		return (this.tras + 1) % tam == this.frente;
	}

	public int getTam() {
		return this.tam;
	}
}
