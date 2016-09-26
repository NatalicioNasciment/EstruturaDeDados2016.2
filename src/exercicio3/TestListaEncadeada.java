package exercicio3;

public class TestListaEncadeada {
public static void main(String[] args) throws Exception {
	
	ListaEncadeada lista = new ListaEncadeada();
	lista.adicionaNoInicio("Natalicio");
	lista.adiciona("Danisio");
	System.out.println(lista);
	System.out.println(lista.tamanho());
	System.out.println(lista.busca(1));
//	lista.adiciona("Dmon");
//	lista.adicionaNoInicio("Natalicio");
	
	
//	System.out.println(lista);
//	System.out.println("-------------------------------------------------------------------------------------------------");
//	System.out.println("O indice informado corresponde ao elemento : " + lista.busca(1));
//	System.out.println("-------------------------------------------------------------------------------------------------");
//	System.out.println("O tamanho da lista é : " +lista.tamanho());
//	System.out.println("-------------------------------------------------------------------------------------------------");
//	lista.removeDoInicio();
//	System.out.println(lista);
//	System.out.println("-------------------------------------------------------------------------------------------------");
//	System.out.println("O tamanho da lista é :" + lista.tamanho());
//	System.out.println("-------------------------------------------------------------------------------------------------");
//	lista.removeDoFim();
//	System.out.println(lista);
//	System.out.println("-------------------------------------------------------------------------------------------------");
//	System.out.println("O tamanho da lista é : " +lista.tamanho());
//	System.out.println("-------------------------------------------------------------------------------------------------");
//	System.out.println("O elemento passado  retorna : "+ lista.verificaExistencia("gerlane"));
}
}
