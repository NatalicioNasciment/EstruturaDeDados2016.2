package exercicio4_5;

public class TestPilhaListaEncadeada {
	public static void main(String[] args) throws Exception {
		PilhaListaEncadeada<String> ple = new PilhaListaEncadeada<>();
		ple.enfilerar("Natalicio");
		ple.enfilerar("Nataliano");
		ple.enfilerar("Gerlane");
		ple.enfilerar("Asssi");
		System.out.println("Lista : " + ple);
		System.out.println("----------------------------------------");
		System.out.println("Indice do elemento passado eh : " + ple.verificarExistencia("Natalicio"));
		System.out.println("----------------------------------------");
		System.out.println("Status da existencia do elemento passado : " + ple.verificaExistencia("Nataliciox"));
		System.out.println("----------------------------------------");
		System.out.println("Lista vazia: " + ple.vazia());
		System.out.println("----------------------------------------");
		System.out.println("Tamanho da lista: " + ple.tamanho());
		System.out.println("----------------------------------------");
		ple.esvaziar();
		System.out.println("Lista vazia: " + ple.vazia());
		System.out.println("----------------------------------------");
	}
}
