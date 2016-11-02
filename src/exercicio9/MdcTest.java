package exercicio9;

import javax.swing.JOptionPane;

public class MdcTest {
	public static void main(String[] args) {

		Mdc f = new Mdc();
		int x, y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Informe x:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe y:"));
		JOptionPane.showMessageDialog(null, "O MDC é : " + f.mdc(x, y));
	}
}