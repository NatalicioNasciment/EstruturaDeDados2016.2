package exercicio4;

public class TestPilhaListsArranjo {
	public static void main(String[] args) {
		PilhaListaArranjo<String> pilha = new PilhaListaArranjo<String>(2);
		pilha.empilhar("Natalicio");
//		System.out.println(pilha.toString());
		System.out.println(pilha.vazia());
	}
}
