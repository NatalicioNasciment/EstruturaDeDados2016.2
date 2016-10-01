package exercicio4;

public class TestFilaListaEncadeada {
	public static void main(String[] args) throws Exception {
		FilaListaEncadeada<String> fle = new FilaListaEncadeada<>();
		fle.enfilerar("Natalicio");
		fle.enfilerar("Daniele");
		fle.enfilerar("Gerlane");
		fle.enfilerar("Assis");
		fle.enfilerar("Nataliano");
		System.out.println("--------------------------------------------");
		System.out.println(fle);
		System.out.println("--------------------------------------------");
		fle.desenfilerar();
		System.out.println(fle);
		System.out.println("--------------------------------------------");
		
		
	}

}
