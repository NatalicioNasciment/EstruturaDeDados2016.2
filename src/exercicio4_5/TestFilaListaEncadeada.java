package exercicio4_5;

public class TestFilaListaEncadeada {
	public static void main(String[] args) throws Exception {
		FilaListaEncadeada<String> fle = new FilaListaEncadeada<>();
		System.out.println(fle);

		fle.enfilerar("Natalicio");
		fle.enfilerar("Daniele");
		// System.out.println("O Elemento corresponde ao índice : " +
		// fle.busca("Daniele"));
		// fle.enfilerar("Gerlane");
		// fle.enfilerar("Assis");
		// fle.enfilerar("Nataliano");
		// System.out.println("--------------------------------------------");
		// System.out.println(fle);
		// System.out.println("--------------------------------------------");
		fle.desenfilerar();
		System.out.println(fle);
		// System.out.println("--------------------------------------------");
		// System.out.println("O indice corresponde : " + fle.busca(0));
		// System.out.println("--------------------------------------------");
		// System.out.println("O Elemento corresponde ao índice : " +
		// fle.busca("Daniele"));
		// System.out.println("Lista está vazia :" + fle.vazia());
		// fle.limpar();
		// System.out.println("--------------------------------------------");
		// System.out.println("Lista está vazia :" + fle.vazia());
		// System.out.println("--------------------------------------------");
		// fle.enfilerar("Ivonete");
		// System.out.println(fle);
		// System.out.println("--------------------------------------------");
		// System.out.println("O tamanho da lista eh : " + fle.tamanhoLista());
		//

	}

}
