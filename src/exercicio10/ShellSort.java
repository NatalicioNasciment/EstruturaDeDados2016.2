package exercicio10;

public class ShellSort {
	public static void shellsort(Comparable[] a) {
		for (int espaco = a.length / 2; espaco > 0; espaco = espaco == 2 ? 1 : (int) (espaco / 2.2))
			for (int i = espaco; i < a.length; i++) {
				Comparable tmp = a[i];
				int j = i;

				for (; j >= espaco && tmp.compareTo(a[j - espaco]) < 0; j -= espaco)
					a[j] = a[j - espaco];
				a[j] = tmp;
			}
	}

}
