package exercicio4;

import static org.junit.Assert.*;

import org.junit.Test;

import exercicio4_5.FilaCircular;
import exercicio4_5.FilaListaEncadeada;

public class TestFilaListaEncadeada {

	@Test
	public void testEnfilerar() throws Exception {
		FilaListaEncadeada<String> fle = new FilaListaEncadeada<>();
		fle.enfilerar("Gerlane");
		fle.enfilerar("Daniele");
		assertEquals(2, fle.tamanho());
	}

	@Test
	public void testDesenfilerar() throws Exception {

		FilaListaEncadeada<String> fle = new FilaListaEncadeada<>();
		fle.enfilerar("Gerlane");
		fle.enfilerar("Daniele");
		fle.enfilerar("Nataliano");
		fle.enfilerar("Natalicio");
		
		fle.desenfilerar();
		fle.desenfilerar();
	
		assertEquals(2, fle.tamanho());
	}
	
	@Test
	public void testBuscaPorIndice() throws Exception {

		FilaListaEncadeada<String> fle = new FilaListaEncadeada<>();
		fle.enfilerar("Gerlane");
		fle.enfilerar("Daniele");
	
		assertEquals("Gerlane", fle.busca(0));
	}
	
	@Test
	public void testBuscaPorElemento() throws Exception {

		FilaListaEncadeada<String> fle = new FilaListaEncadeada<>();
		fle.enfilerar("Gerlane");
		fle.enfilerar("Daniele");
	
		assertEquals(1, fle.busca("Daniele"));
	}
}
