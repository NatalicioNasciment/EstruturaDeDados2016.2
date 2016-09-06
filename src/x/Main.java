package x;


public class Main {
	public static void main(String[] args) {
		int x=0;
		String nome="Teste";
		Lista1 l = new Lista1();
		
		
		for(x=0; x<10; x++){
			l.addLista(x);
		}
		System.out.println(l.quantdeObjetos());
		l.excluir(7);
		System.out.println(l.quantdeObjetos());
		l.imprimirTodos();
		
		
	}
}