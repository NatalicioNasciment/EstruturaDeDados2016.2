package exercicio4;

import static org.junit.Assert.*;

import org.junit.Test;

import exercicio4_5.FilaCircular;

public class TestFilaCircular {

	@Test
	public void testEnfilerar() throws Exception {

		FilaCircular<Integer> fc = new FilaCircular<Integer>(3);
		fc.enfilerar(30);
		fc.enfilerar(40);
		fc.enfilerar(50);
		fc.enfilerar(60);
		fc.enfilerar(60);
		assertEquals(5, fc.quantElemento());
	}

	@Test
	public void testDesenfilerar() throws Exception {

		FilaCircular<Integer> fc = new FilaCircular<Integer>(3);
		fc.enfilerar(30);
		fc.enfilerar(40);
		fc.enfilerar(50);
		fc.enfilerar(60);
		fc.enfilerar(60);

		fc.desenfilerar();
		fc.desenfilerar();
		assertEquals(3, fc.quantElemento());
	}

	@Test
	public void testTamanhoFila() throws Exception {

		FilaCircular<Integer> fc = new FilaCircular<Integer>(3);
		fc.enfilerar(30);
		fc.enfilerar(40);
		fc.enfilerar(50);
		fc.enfilerar(60);
		fc.enfilerar(60);

		assertEquals(6, fc.getTam());
	}
	
	@Test
	public void testFilaVazia(){
		FilaCircular<Integer> fc = new FilaCircular<Integer>(3);
		assertTrue(fc.vazia());
	}
	
	@Test
	public void testFilaCheia() throws Exception{
		FilaCircular<Integer> fc = new FilaCircular<Integer>(3);
		fc.enfilerar(30);
		fc.enfilerar(40);
		fc.enfilerar(50);
		fc.enfilerar(60);
		fc.enfilerar(60);
		assertTrue(fc.cheia());
	}

}


/*
 * frente : 30
 * tras = 40
 * tra(2) + 1  % tam(3) == 0 
 * */



