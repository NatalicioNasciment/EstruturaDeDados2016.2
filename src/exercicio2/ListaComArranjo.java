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
	public Object remover(int indice) throws Exception{
		if(indice < 0 || indice > this.elementos.length){
			throw new Exception("O indice informado não faz parte do intervalo que compõe a  lista");
		}
		
		for(int i = 0; i < this.ultimo && !this.elementos[i].equals(indice); i++){
			if(i >= this.ultimo){
				return null;
			}
			Object elemento ;
			//livro pagina 84
			
		}
		
		return null;
	}
/*
	public Object remover(int indice) throws Exception {
		if (indice < 0 || indice > this.elementos.length) {
			throw new Exception("O indice informado não existe na lista");
		} else {
			for (int i = indice; i < this.elementos.length - 1; i++) {
				this.elementos[indice] = this.elementos[indice + 1];
				
				Object aux =  this.elementos[indice];
				return aux;
			}
			
			return -1;
		}
	}
	*/

	@Override
	public String toString() {
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

	public Object buscarIntervalo(int indiceInicial, int indiceFinal) throws Exception {
		Object resultadoIntervalo[] = null;
		int j = 0;
		if (indiceInicial < 0 || indiceFinal > this.elementos.length) {
			throw new Exception("O intervalo informado não é válido");
		} else {
			for (int i = indiceInicial; i <= indiceFinal; i++, j++) {
				resultadoIntervalo[j] = elementos[i];
			}
		}
		return resultadoIntervalo;
	}

	public void alterar(int indice, Object elemento) {

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
}
