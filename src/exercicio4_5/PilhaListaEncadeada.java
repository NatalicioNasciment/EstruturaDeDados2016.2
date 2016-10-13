package exercicio4_5;

import exercicio3.ListaEncadeada;

public class PilhaListaEncadeada<T> extends ListaEncadeada {
	public PilhaListaEncadeada() {
		super();
	}

	public boolean enfilerar(T item) {
		super.adicionaNoInicio(item);
		return true;
	}

	public boolean desinfilerar() {
		super.remove();
		return true;
	}

	public boolean vazia() {
		return super.vazia();
	}

	public int tamanho() {
		return super.tamanho();
	}

	public void esvaziar() {
		super.esvaziar();
	}

	public boolean existencia(T elemento) {
		return super.verificaExistencia(elemento);
	}

	public int verExistencia(T elemento) throws Exception {
		return super.verificarExistencia(elemento);
	}
}
