package exercicio4_5;

public class TestPilhaListsArranjo {
	public static void main(String[] args) throws Exception {
		PilhaListaArranjo<String> pilha = new PilhaListaArranjo<String>(2);
//		PILHA.EMPILHAR("NATALICIO");
//		PILHA.EMPILHAR("NATALIANO");
//		PILHA.EMPILHAR("GERLANE");
//		PILHA.EMPILHAR("ASSIS");

		System.out.println(pilha);
		System.out.println("----------------------------------------");
		System.out.println("O elemento a ser desempilhado eh: " + pilha.desempilhar());
		System.out.println("----------------------------------------");
		System.out.println(pilha);
		System.out.println("----------------------------------------");
		System.out.println("Pilha vazia: " + pilha.vazia());
		System.out.println("----------------------------------------");
		pilha.alterar("Gerlane Rodrigues");
		System.out.println("O topo da pilha eh: " + pilha.topo());
		System.out.println("----------------------------------------");
		System.out.println(pilha);
		System.out.println("----------------------------------------");
		System.out.println("O tamanho da Pilha é: " + pilha.getTamanho());
		System.out.println("----------------------------------------");
		pilha.alterar(1, "Daniele");
		System.out.println(pilha);
		System.out.println("------------------------------------------------------");
		System.out.println("O indice do elemento passado eh : " + pilha.buscarPorElemento("Gerlane Rodrigues"));
		System.out.println("------------------------------------------------------");
		System.out.println("O indice passado corresponde ao elemento : " + pilha.bucarPorIndice(1));

	}
}
