package exercicio4;

import exercicio2.ListaComArranjo;

public class PilhaListaArranjo<T> extends ListaComArranjo<T>{
	
	public PilhaListaArranjo(int quantElementos) {
		super(quantElementos);
	}
	
	public boolean empilhar(T item) {
		if(item == "" || item == null){
			return false;
		}
		super.adicionar(item);
		return true;
	}
//	public T desempilhar(){
//		if()
//	}
	
//herda o metodo vazia() da classe ListaComArranjo

}
