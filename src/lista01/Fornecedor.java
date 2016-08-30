package lista01;

public class Fornecedor {
	
	private String razaoSocial;
	private String nomeFantasia;
	private Produto produtos[];
	
	private Fornecedor(String razaoSocial ) {
		this.setRazaoSocial(razaoSocial);
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public Produto[] getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
	

}
