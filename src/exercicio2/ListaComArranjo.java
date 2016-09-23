package exercicio2;

public class ListaComArranjo <T>{
	private T[] elementos;
	private T[] elementosAux;
	private int ultimo;

	public ListaComArranjo(int quantElementos) {
		this.elementos = (T[])new Object[quantElementos];
		this.ultimo = 0;
	}

	public boolean adicionar(T elemento) {
		aumentaCapacidade();
		if (this.ultimo < this.elementos.length) {
			this.elementos[this.ultimo] = elemento;
			this.ultimo++;
			return true;
		}
		return false;
	}

	public T remover(int indice) throws Exception {
		T item = null;
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

	public T removerNoInicio() throws Exception{
		if (elementos[0] == null) {
			throw new Exception("Lista Vazio");
		}else{
			T aux = elementos[0];
			for (int i = 0; i < this.elementos.length - 1; i++) {
				elementos[i] = elementos[i + 1];
			}
			elementos[ultimo - 1] = null;
			return aux;
		}
	}

	public void removerPorElemento(T elemento) {
		for (int i = 0; i < this.elementos.length; i++) {

		}
	}

//	public Object removerPorIntervalo(int indiceInicial, int indiceFinal) {
//		return null;
//	}

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

	public T bucarPorIndice(int indice) throws Exception {
		if (indice < 0 || indice > this.elementos.length) {
			throw new Exception("O indice informado não existe na lista");

		} else {
			return this.elementos[indice];
		}
	}

	public int buscarPorElemento(T elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == elemento) {
				return i;
			}
		}
		return -1;
	}

	public T exibirIntervalo(int indiceInicial, int indiceFinal) throws Exception {
		if (indiceInicial > indiceFinal || indiceInicial < 0 || indiceFinal > this.elementos.length) {
			throw new Exception("O intervalo informado não é válido");
		} else {
			for (int i = indiceInicial; i <= indiceFinal; i++) {
				System.out.print(this.elementos[i] + ", ");
			}
			return (T) "";
		}
	}

	public void alterar(int indice, T elemento) throws Exception {
		if (indice < 0 || indice > this.elementos.length) {
			throw new Exception("O indice informado não existe na lista");
		} else {
			this.elementos[indice] = elemento;
		}
	}

	private void aumentaCapacidade() {
		if (this.ultimo == this.elementos.length) {
			T elementosAux[] =(T[])new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosAux[i] = elementos[i];
			}
			this.elementos = elementosAux;
		}
	}

	private void reduzirCapacidade() {
		if (this.ultimo <= this.elementos.length / 2) {
			int tam = (int) (this.elementos.length * (0.75));
			elementosAux = (T[])new Object[tam];
			for (int i = 0; i < tam; i++) {
				this.elementosAux[i] = this.elementos[i];
			}
			this.elementos = elementosAux;
		}
	}
}