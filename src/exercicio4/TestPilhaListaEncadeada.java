package exercicio4;

public class TestPilhaListaEncadeada {
	public static  void main(String[] args) {
		PilhaListaEncadeada<String> ple = new PilhaListaEncadeada<>();
		ple.enfilerar("Natalicio");
		ple.enfilerar("Nataliano");
		ple.enfilerar("Gerlane");
		ple.enfilerar("Asssi");
		System.out.println("Lista : "+ ple);
		System.out.println("----------------------------------------");
		System.out.println("Lista vazia: "+ ple.vazia());
		System.out.println("----------------------------------------");
		System.out.println("Tamanho da lista: "+ple.tamanho());
		System.out.println("----------------------------------------");
	}
}
