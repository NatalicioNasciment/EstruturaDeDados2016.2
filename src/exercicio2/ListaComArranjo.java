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
		}
	}

	@Override
	public String toString() {
		/*StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0; i < this.ultimo-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(ultimo < 0){
			s.append(this.elementos[ultimo-1]);
		}
		return elementos.toString();
		*/
		return " [elementos=" + Arrays.toString(elementos) + "]";
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
	
	public Object buscarPorIntervalo(int indiceInicial, int indiceFinal) throws Exception{
		Object resultadoIntervalo[] = null; 
		int j =0;
		if(indiceInicial < 0 || indiceFinal > this.elementos.length){
			throw new Exception("O intervalo informado não é válido");
		}else{
			for(int i = indiceInicial; i <= indiceFinal; i++, j++){
				resultadoIntervalo[j] = elementos[i];
			}
		}
		return resultadoIntervalo;
	}

	public void remover(int indice) throws Exception {
		if (indice < 0 || indice > this.elementos.length) {
			throw new Exception("O indice informado não existe na lista");
		} else {
			for (int i = indice; i < this.elementos.length - 1; i++) {
				this.elementos[indice] = this.elementos[indice + 1];
			}
		}
	}
}
