package exercicio6;

import exercicio4_5.PilhaListaArranjo;

public class InversaoPalavras<T> extends PilhaListaArranjo<T> {
	public PilhaListaArranjo<T> pilha;
	public PilhaListaArranjo<T> aux;
	boolean x;

	public InversaoPalavras(int quantElementos) {
		super(quantElementos);
	}

	public String inverter(String frase) {
		for (int i = 0; i < contaEspacos(frase) + 1; i++) {
			String[] palavra = null;
			palavra = frase.split(frase, i);
			pilha.empilhar((T) palavra);
		}
		while (frase != null) {
			aux = (PilhaListaArranjo<T>) pilha.topo();
		}
		return aux.toString();
	}

	public static int contaEspacos(String texto) {
		return texto.length() - texto.replaceAll(" ", "").length();
	}

}
