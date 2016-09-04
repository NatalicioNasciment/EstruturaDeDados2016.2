package exercicio2;

public class TestArranjo {
	public static void main(String[] args) throws Exception {
		ListaComArranjo arranjo = new ListaComArranjo(2);
			arranjo.adicionar("Gerlane");
			arranjo.adicionar("Natalicio");
			arranjo.adicionar("Assis");
			arranjo.adicionar("Nataliano");
			arranjo.adicionar("Tica");
			arranjo.adicionar("Manim");
			arranjo.adicionar("Daniele");
			
			System.out.println(arranjo);
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.print("Resultado do intervalo : ");
			System.out.println(arranjo.buscarIntervalo(4, 6));
			arranjo.alterar(6, "Daniele Oliveira");
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("O elemento removido foi: "+ arranjo.remover(1));
			System.out.println(arranjo);	
			System.out.println("-----------------------------------------------------------------------------------");			
			System.out.println("Resultado da busca: "+ arranjo.bucarPorIndice(2));
			System.out.println("-----------------------------------------------------------------------------------");	
			System.out.println("O índice do elemento passado é : "+ arranjo.buscarPorElemento("Assis"));
			System.out.println("-----------------------------------------------------------------------------------");	

	}

}
