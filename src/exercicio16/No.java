package exercicio16;

public class No {

	private Integer valor;

	private No noEsquerda;

	private No noDireita;

	public No() {
	}

	public No(Integer valor) {
		super();
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {

		this.valor = valor;

	}

	public No getNoEsquerda() {

		return noEsquerda;

	}

	public void setNoEsquerda(No noEsquerda) {

		this.noEsquerda = noEsquerda;

	}

	public No getNoDireita() {

		return noDireita;

	}

	public void setNoDireita(No noDireita) {

		this.noDireita = noDireita;

	}

	@Override

	public String toString() {

		return "No [valor=" + valor + "]";

	}

}
