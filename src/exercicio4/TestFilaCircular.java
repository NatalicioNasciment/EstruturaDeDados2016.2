package exercicio4;

public class TestFilaCircular {
	public static void main(String[] args) throws Exception {
		FilaCircular<Integer> fc = new FilaCircular<Integer>(3);
		fc.enfilerar(30);
		fc.enfilerar(40);
		fc.enfilerar(50);
		fc.enfilerar(60);
		fc.enfilerar(70);
		fc.enfilerar(80);
		fc.enfilerar(90);
		fc.enfilerar(100);
		fc.listar();
		fc.desenfilerar();
		fc.desenfilerar();
		fc.desenfilerar();
		fc.desenfilerar();
//		fc.desenfilerar();
//		fc.desenfilerar();
//		fc.desenfilerar();
//		fc.desenfilerar();
		System.out.println("------------------------------------------");
		fc.listar();
		System.out.println("------------------------------------------");
		System.out.println("A quantidade de elementos eh: " +fc.quantElemento());
		System.out.println("------------------------------------------");
		System.out.println("O tamanho da lista é : " + fc.getTam());
		
//		fc.listar();
//		System.out.println();
//		System.out.println(fc.desenfilerar());
		// fc.listar();
//		fc.listar();
//		System.out.println();
//		System.out.println(fc.desenfilerar());	
		// System.out.println("A quantidade de elemento: " +
		// fc.quantElemento());
		// System.out.println("----------------");
		// fc.desenfilerar();
		// fc.listar();
		// System.out.println("Tamanho: " + fc.getTam());

		// System.out.println("Lista esta vazia: " + fc.vazia());
	}

}
