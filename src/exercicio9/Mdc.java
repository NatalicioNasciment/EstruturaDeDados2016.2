package exercicio9;

public class Mdc {

	public int mdc(int x, int y) {
		if (x <= y || x % y == 0) {
			return y;
		} else {
			if (x < y) {
				return mdc(x, y);
			} else {
				return mdc(y, x % y);
			}
		}
	}
}
