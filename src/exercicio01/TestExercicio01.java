package exercicio01;

public class TestExercicio01 {
	public static void main(String[] args) {
		
		Produto leite = new Produto(111, "Leite Desnatado", 10, 4.10);
		Endereco  enderecoLeite = new Endereco("CE", "SGA", "Parada", "S/N");
		
		Produto refrigerante = new Produto(112, "Coca-Cola", 20, 5.70);
		Endereco  enderecoRefrigerante = new Endereco("CE", "Fortaleza", "BairroX", "1024");
		
		System.out.println("codigo |   Nome do Produto | Estoque  |  Valor Unid |      Endereço                   |");
		System.out.println("_______|___________________|________________________|_________________________________|");
		System.out.println(leite.getCod()+ "    |   "+ leite.getNome() + " |    " +leite.getEstoque() + "    | R$ " + leite.getPreco() + "      |    " + leite.solicitarEndereco(enderecoLeite)+"            |");
	
		System.out.println("_______|___________________|__________|_____________|_________________________________|");
		System.out.println(refrigerante.getCod()+ "    |   "+ refrigerante.getNome() + "       |    " +refrigerante.getEstoque() + "    | R$ " + refrigerante.getPreco() + "      |" + refrigerante.solicitarEndereco(enderecoRefrigerante)+"        |");
		System.out.println("_______|___________________|__________|_____________|_________________________________|");
	}
}