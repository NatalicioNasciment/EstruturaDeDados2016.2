package exercicio4_5;

import exercicio2.ListaComArranjo;

public class PilhaListaArranjo<T> extends ListaComArranjo<T> {

	public PilhaListaArranjo(int quantElementos) {
		super(quantElementos);
	}

	public boolean empilhar(T item) {
		if (item == " " || item == null) {
			return false;
		}
		super.adicionar(item);
		return true;
	}

	public T desempilhar() {
		if (this.vazia()) {
			return null;
		}
		return this.elementos[--tamanho];
	}

	public T topo() {
		if (this.vazia()) {
			return null;
		}
		return this.elementos[tamanho - 1];
	}

	public void alterar(int indice, T elemento) throws Exception {
		super.alterar(indice, elemento);
	}

	public void alterar(T elemento) throws Exception {
		super.alterar(elemento);
	}

	public T bucarPorIndice(int indice) throws Exception {
		return super.bucarPorIndice(indice);
	}

	public int buscarPorElemento(T elemento) {
		return super.buscarPorElemento(elemento);
	}

	public boolean vazia() {
		return super.vazia();
	}

}
