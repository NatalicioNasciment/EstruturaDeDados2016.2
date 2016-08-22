package exercicio01;
/*
 * Considere um cadastro de produtos de um estoque, com as seguintes
informações para cada produto:
● Codigo de identificação do produto: representado por um valor inteiro
● Nome do produto: com ate 50 caracteres
● Quantidade disponível no estoque: representado por um número inteiro
● Preço de venda: representado por um valor real
1)Defina uma estrutura de dados, denominada produto, que tenha os campos
apropriados para guardar as informações de um produto, conforme descrito
acima.
2)Escreva uma função ou método que receba os dados de um produto (código,
nome, quantidade e preço) e retome o endereço de um struct produto criado
dinamicamente e inicializado com os valores recebidos como parâmetros pela
função. Essa função deve ter o seguinte protótipo ou constrututor:
struct produto* cria (mt cod, char* nome, mt quant, float preco);
public produto(int cod, String nome, long quant, double preco);
3)Proponha demais atributos e operações aplicáveis a um produto.
 */

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