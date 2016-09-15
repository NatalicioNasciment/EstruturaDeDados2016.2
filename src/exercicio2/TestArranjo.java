package exercicio2;

public class TestArranjo {
	public static void main(String[] args) throws Exception {
		ListaComArranjo arranjo = new ListaComArranjo(2);
		
		arranjo.adicionar("Natlaicio");
		arranjo.adicionar("Andinha");
//		arranjo.adicionar("Todo liano");
//		arranjo.adicionar("Nataliano");
//		arranjo.adicionar("Assis");
//		arranjo.adicionar("Ivonete");
//		arranjo.adicionar("Algusto");
		
		System.out.println(arranjo);
		System.out.println(	arranjo.removerNoInicio());
		System.out.println(arranjo);
//		System.out.println("-----------------------------------------------------------------------------------");
//		System.out.print("Resultado do intervalo : ");
//		System.out.println(arranjo.exibirIntervalo(4, 6));
//		arranjo.alterar(6, "Daniele Oliveira");
//		System.out.println("-----------------------------------------------------------------------------------");
//		System.out.println("O elemento removido foi: " + arranjo.remover(1));
//		System.out.println(arranjo);
//		System.out.println("-----------------------------------------------------------------------------------");
//		System.out.println("Resultado da busca: " + arranjo.bucarPorIndice(2));
//		System.out.println("-----------------------------------------------------------------------------------");
//		System.out.println("O índice do elemento passado é : " + arranjo.buscarPorElemento("Assis"));
//		System.out.println("-----------------------------------------------------------------------------------");
//		System.out.println("O elemento removido foi: " + arranjo.remover(2));
//		System.out.println(arranjo);
//		System.out.println("O índice do elemento removido é : " + arranjo.buscarPorElemento("Assis"));
		
	}

}
