package exercicio4;

public class TestFilaCircular {
	public static void main(String[] args) throws Exception {
		FilaCircular<Integer> fc = new FilaCircular<Integer>(2);
		System.out.println(fc.vazia());
		fc.enfilerar(3);
	}

}
