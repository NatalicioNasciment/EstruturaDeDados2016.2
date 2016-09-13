package exercicio3;

public class ListaEncadeada {
	private Celula primeira;
	private Celula ultima;
	private int totalElementos;

	public ListaEncadeada() {
		primeira = null;
		ultima = primeira;
	}

	public void adiciona(Object elemento) {
		if (this.totalElementos == 0) {
			this.adicionaNoInicio(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultima.setProx(nova);
			this.totalElementos++;
		}
	}

	public void adicionaNoInicio(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;

		if (totalElementos == 0) {
			this.ultima = this.primeira;
		}
		this.totalElementos++;
	}

	public void adiciona(int posicao, Object elemento) throws Exception {
		if (posicao == 0) {
			this.adicionaNoInicio(elemento);
		} else if (posicao == this.totalElementos) {
			this.adiciona(elemento);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula nova = new Celula(anterior.getProx(), elemento);
			anterior.setProx(nova);
			this.totalElementos++;
		}
	}

	public Object busca(int posicao) throws Exception {
		return this.pegaCelula(posicao).getElemento();
	}

	public void removeDoInicio(){
			this.primeira = this.primeira.getProx();
			this.totalElementos--;

		if (this.totalElementos == 0) {
			this.ultima = null;
		}
	}
	
	public void removeDoFim() {
	}

	public void remove(int posicao) {
	}

	public int tamanho() {
		return 0;
	}

	public boolean contem(Object o) {
		return false;
	}

	public String toString() {
		if (this.totalElementos == 0) {
			return "[]";
		}
		StringBuilder s = new StringBuilder("[");
		Celula atual = primeira;
		for (int i = 0; i < this.totalElementos - 1; i++) {
			s.append(atual.getElemento());
			s.append(", ");
			atual = atual.getProx();
		}
		s.append(atual.getElemento());
		s.append("]");
		return s.toString();
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao > 0 && posicao < this.totalElementos;
	}

	private Celula pegaCelula(int posicao) throws Exception {
		if (!this.posicaoOcupada(posicao)) {
			throw new Exception("Posicao inexistente");
		} else {
			Celula atual = primeira;
			for (int i = 0; i < posicao; i++) {
				atual = atual.getProx();
			}
			return atual;
		}
	}

}
