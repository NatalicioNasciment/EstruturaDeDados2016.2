package exercicio_olimpiada;

import java.util.Scanner;

public class TiroAoAlvo {
    private String categoria;
    private String nome;
    private String pais;
	private int tiros[];
	private int pontos;
    private static int totalPontuacao = 0;
    private static int distancia = 30;
    
    Scanner entrada = new Scanner(System.in);
   
    public TiroAoAlvo(){}
   
    public TiroAoAlvo(String categoria, String nome, String pais) {
        this.setCategoria(categoria);
        this.setNome(nome);
        this.setPais(pais);

    }
   
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getDistancia() {
        return distancia;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    public int[]  getTiros() {
       return tiros;
    }
    public void setTiro(int [] tiros) {
        this.tiros = tiros;
    }
    
    
    public void atirarFlexas(){
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
   
    public int getPontuacaoTotal(){
       return totalPontuacao;
    }
}
