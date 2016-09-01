package exercicio1;
public class Endereco {
	private String num;
	private String cidade;
	private String bairro;
	private String estado;
	
	public Endereco(){}
	public Endereco(String estado, String cidade, String bairro, String num){
		this.setEstado(estado);
		this.setCidade(cidade);
		this.setBairro(bairro);
		this.setNum(num);
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getExibirEnderecoProduto(){
		return  estado + " " + cidade + " " + bairro + " " + num;
	}
}