package exercicio2;

public class CasaFilantropica {
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	
	public CasaFilantropica(){}
	
	public CasaFilantropica(String cnpj, String razaoSocial, String nomeFantasia) {
		this.setCnpj(cnpj);
		this.setRazaoSocial(razaoSocial);
		this.setNomeFantasia(nomeFantasia);
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
	
	public void adicionar(){
		
	}
	public void listar(){
		
	}
	public void remover(){
		
	}
}
