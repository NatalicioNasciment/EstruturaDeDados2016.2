package exercicio4;

public class TestFilaCircular {
	public static void main(String[] args) throws Exception {
		FilaCircular<Integer> fc = new FilaCircular<Integer>(5);
		fc.enfilerar(3);
		fc.enfilerar(3);
		fc.enfilerar(3);
		fc.enfilerar(3);
		fc.listar();
		System.out.println("----------------");
		fc.desenfilerar();
		fc.listar();
//		System.out.println("Tamanho: " + fc.getTam());
	
	
//		System.out.println("Lista esta vazia: " + fc.vazia());
	}

}
