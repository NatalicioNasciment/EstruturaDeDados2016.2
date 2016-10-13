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
			this.primeira = new Celula<T>();
			this.ultima = this.primeira;
			Celula<T> aux = new Celula<T>();
			aux.setElemento(elemento);
			aux.setProx(null);
			this.ultima.setProx(aux);
			this.ultima = aux;
			this.tamLista++;
			return true;
		} else {
			Celula<T> aux = new Celula<T>();
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
		// return (T) this.pegaCelula(posicao).getElemento();
		if (posicao < 0 || posicao > this.tamLista) {
			throw new Exception("Posicao invalida");
		} else {
			Celula<T> aux = this.primeira.getProx();
			for (int i = 0; i < this.tamLista; i++) {
				if (i == posicao) {
					return aux.getElemento();
				}
				aux = aux.getProx();
			}
		}
		return null;
	}

	public int busca(T elemento) throws Exception {
		Celula<T> aux = this.primeira.getProx();
		for (int i = 0; i < this.tamLista; i++) {
			if(aux.getElemento().equals(elemento)){
				return i;
			}
		}
		return -1;
	}

	public void remove() {
		this.primeira = this.primeira.getProx();
		this.tamLista--;
		if (this.tamLista == 0) {
			this.ultima = null;
		}
	}

	public void removeDoFim() throws Exception {
		if (this.tamLista == 1) {
			this.remove();
		} else {
			Celula penultima = this.pegaCelula(tamLista - 1);
			Celula aux = penultima.getProx();
			ultima = penultima;
			this.tamLista--;
		}
	}

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

	public int verificarExistencia(T elemento) throws Exception {
		Celula atual = this.primeira.getProx();
		for (int i = 0; i < this.tamLista; i++) {
			if (atual.getElemento().equals(elemento)) {
				return i;
			}
			atual = atual.getProx();
		}
		throw new Exception("Erro");
		// return -1;
	}

	public String toString() {
		if (vazia()) {
			return "[]";
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
			Celula atual = this.primeira.getProx();
			for (int i = 0; i <= posicao; i++) {
				if (i == posicao) {
					atual = (Celula) atual.getElemento();
					return atual;
				}
				atual = atual.getProx();
			}
			return null;

		}
		// return primeira;
	}

	public void listar() {
		Celula<T> aux = this.primeira.getProx();
		for (int i = 0; i < this.tamLista - 1; i++) {
			System.out.println("[" + aux.getElemento());
			aux = aux.getProx();
		}
	}

	public boolean vazia() {
		if (this.primeira == null) {
			return true;
		}
		return false;
	}

	public void esvaziar() {
		this.primeira = null;
		this.ultima = primeira;
		tamLista = 0;
	}
}
