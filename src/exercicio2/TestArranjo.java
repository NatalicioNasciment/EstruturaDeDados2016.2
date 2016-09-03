package exercicio2;

public class TestArranjo {
	public static void main(String[] args) throws Exception {
		ListaComArranjo arranjo = new ListaComArranjo(2);
			arranjo.adicionar("Gerlane");
			arranjo.adicionar("Assis");
			arranjo.adicionar("Nataliano");
			arranjo.adicionar(1);
			arranjo.adicionar("Assis");
			arranjo.adicionar("Daniele");
			arranjo.adicionar("Natalicio");
			
			System.out.println(arranjo.toString());
			System.out.println();
			
			System.out.println("O elemento removido foi: "+ arranjo.remover(6));
			System.out.println(arranjo.toString());	
			
			System.out.println();
			System.out.println("Resultado da busca: "+ arranjo.bucarPorIndice(2));
			System.out.println("O índice do elemento passado é : "+ arranjo.buscarPorElemento("Assis"));
//			System.out.println(arranjo.buscarPorIntervalo(-1, 3));
	}

}
