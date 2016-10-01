package exercicio4;

public class TestFilaListaEncadeada {
	public static void main(String[] args) throws Exception {
		FilaListaEncadeada<String> fle = new FilaListaEncadeada<>();
		fle.enfilerar("Natalicio");
		fle.enfilerar("Daniele");
		fle.desenfilerar();
		System.out.println(fle);
		
	}

}
