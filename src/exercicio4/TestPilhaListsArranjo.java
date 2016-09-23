package exercicio4;

public class TestPilhaListsArranjo {
	public static void main(String[] args) {
		PilhaListaArranjo<String> pilha = new PilhaListaArranjo<String>(2);
		pilha.empilhar("Natalicio");
		pilha.empilhar("Nataliano");
		pilha.empilhar("Gerlane");
		
		System.out.println(pilha);
		System.out.println("O elemento a ser desempilhado eh: " + pilha.desempilhar());
		System.out.println(pilha);
		System.out.println("O topo da pilha eh: " + pilha.topo());
//		System.out.println(pilha.toString());
//		System.out.println(pilha.vazia());
	}
}
