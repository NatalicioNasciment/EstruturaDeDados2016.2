package x;

import java.util.ArrayList;

public class Lista1 {
	
	private int tamanho = 8;
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	
	Object lista[] = new Object[tamanho];
    public void addLista (Object obj){
		boolean aux=false;
		for(int i=0; i<tamanho; i++){
			if(lista[i]==null){
				lista[i]=obj;
				aux=true;
				break;
			}
		}
		if(aux==false){
			Object lista2[] = new Object[tamanho*2];
			for(int i=0; i<tamanho; i++){
				lista2[i]=lista[i];
			}
			lista=lista2;
			lista2=null;
			lista[tamanho]=obj;
			setTamanho(tamanho*2);
		}
	}
	public void imprimirTodos(){
		for(int i=0; i<quantdeObjetos(); i++){
			System.out.print(lista[i] + " ");
		}
	}
	public int quantdeObjetos(){
		int i;
		for(i=0; i<tamanho; i++){
			if(lista[i]==null){
				return i;
			}
		}
		return i;
	}
	public void excluir(int indice){
		lista[indice]=null;
		for(; indice<tamanho-1; indice++){
			lista[indice]=lista[indice+1];
		}
	}
}