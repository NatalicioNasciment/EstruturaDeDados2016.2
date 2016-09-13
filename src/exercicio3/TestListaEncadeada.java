package exercicio3;

public class TestListaEncadeada {
public static void main(String[] args) throws Exception {
	
	ListaEncadeada lista = new ListaEncadeada();
	lista.adicionaNoInicio("Natalicio");
	lista.adicionaNoInicio("Daniele");
	lista.adicionaNoInicio("Gerlane");
	lista.adicionaNoInicio("Assis");
	lista.adicionaNoInicio("Nataliano");
	lista.adicionaNoInicio("Suely");
	lista.adiciona("Marluce");
	lista.adicionaNoInicio("Danisio");
	lista.adicionaNoInicio("Danilo");
	lista.adicionaNoInicio("Nilsinha");
	lista.adiciona(2, "Liano");
//	lista.adiciona("Danilo"); ta dando erro
	System.out.println(lista);
	System.out.println("O indice informado corresponde ao elemento : " + lista.busca(7));
	lista.removeDoInicio();
	System.out.println();
	System.out.println(lista);
	
}
}
