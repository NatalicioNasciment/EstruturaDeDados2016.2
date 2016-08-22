package exercicio01;

public class Produto {
	private int cod;
	private String nome;
	private long estoque;
	private double preco;
	
	public Produto(){}
	public Produto(int cod,String nome,long quant ,double preco){
		this.setCod(cod);
		this.setNome(nome);
		this.setEstoque(quant);
		this.setPreco(preco);
	}	
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getEstoque() {
		return estoque;
	}
	public void setEstoque(long quant) {
		this.estoque = quant;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String solicitarEndereco(Endereco endereco){
		return endereco.getExibirEnderecoProduto();
	}
}