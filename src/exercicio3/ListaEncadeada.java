package exercicio3;

public class ListaEncadeada<T> {
	private Celula primeira;
	private Celula ultima;
	private int tamLista;

	public ListaEncadeada() {
		this.primeira = null;
		this.ultima = this.primeira;
	}

	public boolean adiciona(T elemento) {
		if (vazia()) {
			this.adicionaNoInicio(elemento);
			return true;
		} else {
			Celula aux = new Celula(elemento);
			aux.setElemento(elemento);
			aux.setProx(null);
			this.ultima.setProx(aux);
			this.ultima = aux;
			this.tamLista++;
			return true;
		}
	}

	public void adicionaNoInicio(T elemento) {
		Celula<T> aux = new Celula<>();
		aux.setElemento(elemento);
		aux.setProx(primeira);
		this.primeira = aux;
		this.tamLista++;
	}

	public T busca(int posicao) throws Exception {
		return (T) this.pegaCelula(posicao).getElemento();
	}

	// public void removeDoInicio() {
	// this.primeira = this.primeira.getProx();
	// this.totalElementos--;
	// if (this.totalElementos == 0) {
	// this.ultima = null;
	// }
	// }
	//
	// public void removeDoFim() throws Exception {
	// if (this.totalElementos == 1) {
	// this.removeDoInicio();
	// } else {
	// Celula penultima = this.pegaCelula(totalElementos - 1);
	// Celula aux = penultima.getProx();
	// ultima = penultima;
	// this.totalElementos--;
	// }
	// }
	//
	public int tamanho() {
		return this.tamLista;
	}

	public boolean verificaExistencia(T elemento) {
		Celula atual = this.primeira.getProx();
		while (atual != null) {
			if (atual.getElemento().equals(elemento)) {
				return true;
			}
			atual = atual.getProx();
		}
		return false;
	}

	public String toString() {
		if (vazia()) {
			return "A lista está vazia!";
		} else {
			Celula<T> aux = this.primeira.getProx();
			StringBuilder s = new StringBuilder();
			s.append("[");
			while (aux != null) {
				s.append(aux.getElemento());
				aux = aux.getProx();
				if (aux == null) {
					s.append("]");
				} else {
					s.append(", ");
				}
			}
			return s.toString();
		}
	}

	private Celula pegaCelula(int posicao) throws Exception {
		if (posicao < 0 || posicao > this.tamLista) {
			throw new Exception("Posicao inexistente");
		} else {
			Celula atual = this.primeira;
			for (int i = 0; i <= posicao; i++) {
				if (i == posicao) {
					atual = atual.getProx();
					atual = (Celula) atual.getElemento();
					break;
				}
				return atual;
			}

		}
		return primeira;
	}

	public void listar() {
		Celula<T> aux = this.primeira.getProx();
		for (int i = 0; i < this.tamLista -1; i++) {
			System.out.println("[" +aux.getElemento());
			aux = aux.getProx();
		}
	}

	public boolean vazia() {
		if (this.primeira == null) {
			return true;
		}
		return false;
	}
}
