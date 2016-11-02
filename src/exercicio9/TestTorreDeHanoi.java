package exercicio9;

import java.util.Stack;

public class TestTorreDeHanoi {
	public static void main(String[] args) {
		
		Stack<Integer> original = new Stack<>();
		Stack<Integer> destino = new Stack<>();
		Stack<Integer> aux = new Stack<>();

		original.push(4);
		original.push(3);
		original.push(2);
		original.push(1);

		TorreDeHanoi.torreDeHanoi(original.size(), original, destino, aux);
	}

}
