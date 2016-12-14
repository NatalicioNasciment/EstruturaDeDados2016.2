package exercicio17;

public abstract class ArvoreDeBusca {

	private int valorBusca;
	private String textoResposta;

	public abstract boolean buscarResultado(No no);

	public abstract int contarNosFolha();

	protected void obterResultadoPaternal(No no) {
		String retorno = "";
		No noValor = no;
		retorno += noValor.getValor();
		while (noValor.getNoPai() != null) {
			noValor = noValor.getNoPai();
			retorno = noValor.getValor() + " " + retorno;
		}
		this.textoResposta = retorno;
	}

	public void exibirTextoResultado() {
		if (this.textoResposta != null) {
			System.out.println("O caminho percorrido será: " + this.textoResposta);
		} else {
			System.out.println("O valor " + this.valorBusca + " não foi encontrado.");
		}
	}

	public String getTextoResposta() {
		return textoResposta;
	}

	public void setTextoResposta(String textoResposta) {
		this.textoResposta = textoResposta;
	}

	public void setValorBusca(int valorBusca) {
		this.valorBusca = valorBusca;
	}

	public boolean isResultadoBusca(No no) {
		return no.getValor() == valorBusca;
	}

	public int getValorBusca() {
		return valorBusca;
	}

}
