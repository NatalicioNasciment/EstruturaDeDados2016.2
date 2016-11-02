package exercicio7;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int n = 32000;
		int x[] = new int[n];
		Random ale = new Random();
		for (int i = 0; i < n; i++) {
			x[i] = ale.nextInt(5000) - 1000;
		}

		ThreeSum ts = new ThreeSum();
		Stopwatch crono = new Stopwatch();
		ts.count(n, x);
		System.out.print(crono.elapsedTime());

	}

}