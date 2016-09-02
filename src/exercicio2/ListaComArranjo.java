package exercicio2;

import java.util.Arrays;

public class ListaComArranjo {
	private Object elementos[];
	private int ultimo;

	public ListaComArranjo(int quantElementos) {
		this.elementos = new Object[quantElementos];
		this.ultimo = 0;
	}

	public boolean adicionar(Object elemento) {
		aumentaCapacidade();
		if (this.ultimo < this.elementos.length) {
			this.elementos[this.ultimo] = elemento;
			this.ultimo++;
			return true;
		}
		return false;
	}

	private void aumentaCapacidade() {
		if (this.ultimo == this.elementos.length) {
			Object elementosAux[] = new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosAux[i] = elementos[i];
			}
			this.elementos = elementosAux;
			;
		}
	}

	@Override
	public String toString() {
		return "ListaComArranjo [elementos=" + Arrays.toString(elementos) + "]";
	}

	public Object bucarPorIndice(int indice) throws Exception {
		if (indice >= 0 && indice <= this.elementos.length) {
			return this.elementos[indice];
		} else {
			throw new Exception("O indice informado n�o existe na lista");
		}
	}

	public int buscarPorElemento(Object elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == elemento) {
				return i;
			}
		}
		return -1;
	}
	
	public void remover(int indice) {
		
		for(int i = indice; i < this.elementos.length -1; i++){
			this.elementos[i] = this.elementos[i +1];
		}
	}
}
