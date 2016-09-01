package exercicio_olimpiada;

import java.util.Scanner;

public class TiroAoAlvo {
	private String categoria;
	private int pontos;
	private static int totalPontuacao = 0;
	private static int distancia = 30;

	Scanner entrada = new Scanner(System.in);

	public TiroAoAlvo() {
	}

	public TiroAoAlvo(String categoria) {
		this.setCategoria(categoria);
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public void atirarFlexas() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print("Informe a pontuação do  " + j + " tiro da distancia " + distancia + "m : ");
				pontos = entrada.nextInt();
				totalPontuacao = totalPontuacao + pontos;
			}
			if (categoria.equals("F") && (distancia == 50 || distancia == 60)) {
				distancia = distancia + 10;
			} else {
				distancia = distancia + 20;
			}
		}
	}

	public int getPontuacaoTotal() {
		return totalPontuacao;
	}

	public void competicaoTiroAoAolvo(Competidor competidor[]) {
		//aqui eu vou passar o nome e o pais do competidor e logo em seguida 
		//irei chamar o metodo atirarFlexa().
	}
}
