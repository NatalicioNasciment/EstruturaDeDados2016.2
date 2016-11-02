package exercicio9;

import java.util.Stack;

public class TorreDeHanoi<T> {

	public static void torreDeHanoi(int discos, Stack<Integer> original, Stack<Integer> destino, Stack<Integer> aux) {
		if (discos > 0) {
			torreDeHanoi(discos - 1, original, aux, destino);
			destino.push(original.pop());
			System.out.println("-------------------------");
			System.out.println("Original : " + original);
			System.out.println("Destino : " + destino);
			System.out.println("Aux : " + aux);

			torreDeHanoi(discos - 1, aux, destino, original);

		}
	}
}
