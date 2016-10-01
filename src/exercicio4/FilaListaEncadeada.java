package exercicio4;

import exercicio3.ListaEncadeada;

//primeiro a entrar primeiro a sair

//1 2 3 3 5

public class FilaListaEncadeada<T> extends ListaEncadeada<T> {
	public FilaListaEncadeada() {
		super();
	}
	
	public boolean enfilerar(T elemento){
		return super.adiciona(elemento);
	}
	public void desenfilerar() throws Exception{
		super.removeDoInicio();
	}
	
	

}
