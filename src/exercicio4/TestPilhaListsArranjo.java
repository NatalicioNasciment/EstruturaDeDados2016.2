package exercicio4;

public class TestPilhaListsArranjo {
	public static void main(String[] args) throws Exception {
		PilhaListaArranjo<String> pilha = new PilhaListaArranjo<String>(2);
		pilha.empilhar("Natalicio");
		pilha.empilhar("Nataliano");
		pilha.empilhar("Gerlane");
		pilha.empilhar("Assis");
		
		
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
		System.out.println("O tamanho da Pilha �: "+ pilha.getTamanho());
		
	}
}
