package exercicio15;

public class No {
	private boolean chave;
	private No primFilho;
	private No proxIrmao;
	
	public No(){
		primFilho = null;
		proxIrmao = null;
	}

	public No getPrimFilho() {
		return primFilho;
	}

	public void setPrimFilho(No primFilho) {
		this.primFilho = primFilho;
	}

	public No getProxIrmao() {
		return proxIrmao;
	}

	public void setProxIrmao(No proxIrmao) {
		this.proxIrmao = proxIrmao;
	}
	
	
}
