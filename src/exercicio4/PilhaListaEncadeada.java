package exercicio4;

import exercicio3.ListaEncadeada;

public class PilhaListaEncadeada<T> extends ListaEncadeada{
	public PilhaListaEncadeada(){
		super();
	}
	public boolean enfilerar(T item){
		super.adicionaNoInicio(item);
		return true;
		
	}
	public boolean desinfilerar(){
		return false;
	}
	public boolean vazia(){
		return super.vazia();
	}
	public int tamanho(){
		return super.tamanho();
	}
	
	
}
