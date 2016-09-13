package exercicio3;

public class ListaEncadeada {
	private EstruturaLista primeiro;
	private EstruturaLista ultimo;

	public ListaEncadeada(){
		primeiro = null;
		ultimo = primeiro;
	}
	public void adicionar(Object item){
		if(primeiro == null){
			primeiro = new EstruturaLista();
			ultimo = primeiro;
			EstruturaLista nova = new EstruturaLista();
			nova.setElemento(item);
			nova.setProx(null);
			ultimo.setProx(nova);
		}
	}

}
