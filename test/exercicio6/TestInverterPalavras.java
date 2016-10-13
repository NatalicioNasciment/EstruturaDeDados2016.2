package exercicio6;

import java.util.Scanner;

public class TestInverterPalavras {

	public static void main(String[] args) {
		
		InversaoPalavras<String> ip = new InversaoPalavras<>(2);	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = input.nextLine();
		ip.inverter(frase);
	}

}
