package exercicio3;

public class ListaComArranjo {
	private Object elementos[];
	private Object elementosAux[] = null;
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

	public Object remover(int indice) throws Exception {
		Object item = null;
		if (indice < 0 || indice > this.elementos.length) {
			throw new Exception("O indice informado não existe na lista");
		} else {
			item = this.elementos[indice];
			for (int i = indice; i < this.elementos.length - 1; i++) {
				this.elementos[i] = this.elementos[i + 1];
			}
			reduzirCapacidade();
			return item;
		}
	}

	public void removerPorElemento(Object elemento) {
		for(int i = 0; i < this.elementos.length; i++){
			
		}
	}

	public Object removerPorIntervalo(int indiceInicial, int indiceFinal) {
		return null;
	}

	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("[");

		for (int i = 0; i < this.elementos.length; i++) {
			string.append(this.elementos[i]);
			string.append(", ");
		}

		string.append("]");

		return string.toString();
	}

	public Object bucarPorIndice(int indice) throws Exception {
		if (indice < 0 || indice > this.elementos.length) {
			throw new Exception("O indice informado não existe na lista");

		} else {
			return this.elementos[indice];
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

	public Object exibirIntervalo(int indiceInicial, int indiceFinal) throws Exception {
		if (indiceInicial > indiceFinal || indiceInicial < 0 || indiceFinal > this.elementos.length) {
			throw new Exception("O intervalo informado não é válido");
		} else {
			for (int i = indiceInicial; i <= indiceFinal; i++) {
				System.out.print(this.elementos[i] + ", ");
			}
			return "";
		}
	}

	public void alterar(int indice, Object elemento) throws Exception {
		if (indice < 0 || indice > this.elementos.length) {
			throw new Exception("O indice informado não existe na lista");
		} else {
			this.elementos[indice] = elemento;
		}
	}

	private void aumentaCapacidade() {
		if (this.ultimo == this.elementos.length) {
			Object elementosAux[] = new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosAux[i] = elementos[i];
			}
			this.elementos = elementosAux;
		}
	}

	private void reduzirCapacidade() {
		if (this.ultimo <= this.elementos.length / 2) {
			int tam = (int) (this.elementos.length * (0.75));
			elementosAux = new Object[tam];
			for (int i = 0; i < tam; i++) {
				this.elementosAux[i] = this.elementos[i];
			}
			this.elementos = elementosAux;
		}
	}
}