package exercicio01;

/*
 *Considere um cadastro de produtos de um estoque, com as seguintes
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
 * */

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
