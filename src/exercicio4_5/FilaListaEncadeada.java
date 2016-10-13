package exercicio4_5;

import exercicio3.ListaEncadeada;

//1 2 3 3 5

public class FilaListaEncadeada<T> extends ListaEncadeada<T> {
	public FilaListaEncadeada() {
		super();
	}

	public boolean enfilerar(T elemento) {
		return super.adiciona(elemento);
	}

	public void desenfilerar() throws Exception {
		super.remove();
	}

	public T busca(int posicao) throws Exception {
		return super.busca(posicao);
	}

	public int busca(T elemento) throws Exception {
		return super.busca(elemento);
	}

	public int tamanhoLista() {
		return super.tamanho();
	}

	public boolean vazia() {
		return super.vazia();
	}

	public void limpar() {
		super.esvaziar();
	}
}
