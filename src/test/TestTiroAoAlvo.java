package test;

import java.util.Scanner;

import exercicio_olimpiada.TiroAoAlvo;

public class TestTiroAoAlvo {
    public static void main(String[] args) {
       TiroAoAlvo partida = new TiroAoAlvo();
       
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Informe a categoria: ");
       partida.setCategoria(entrada.next());
       
       System.out.print("Informe o seu nome: ");
       partida.setNome(entrada.next());
       
       System.out.print("Informe seu pais: ");
       partida.setPais(entrada.next());
       
       partida.atirarFlexas();
       
       System.out.println("a pontuação total é : "+ partida.getPontuacaoTotal());
       
    }
}
