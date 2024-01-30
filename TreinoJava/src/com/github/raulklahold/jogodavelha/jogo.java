package com.github.raulklahold.jogodavelha;

public class jogo {
	 import java.util.Scanner;

	 public class Jogo {

	     private Tabuleiro tabuleiro;
	     private Jogador jogadorAtual;

	     public Jogo() {
	         tabuleiro = new Tabuleiro();
	         jogadorAtual = new Jogador('X');
	     }

	     public void jogar() {
	         Scanner scanner = new Scanner(System.in);

	         do {
	             tabuleiro.exibir();
	             realizarJogada();

	             if (tabuleiro.verificarVitoria(jogadorAtual)) {
	                 tabuleiro.exibir();
	                 System.out.println("Jogador " + jogadorAtual.getSimbolo() + " venceu!");
	                 break;
	             }

	             if (tabuleiro.verificarEmpate()) {
	                 tabuleiro.exibir();
	                 System.out.println("Empate!");
	                 break;
	             }

	             alternarJogador();

	         } while (true);

	         scanner.close();
	     }

	     private void realizarJogada() {
	         Scanner scanner = new Scanner(System.in);
	         int linha, coluna;

	         do {
	             System.out.println("Jogador " + jogadorAtual.getSimbolo() + ", digite a linha (0, 1 ou 2): ");
	             linha = scanner.nextInt();
	             System.out.println("Jogador " + jogadorAtual.getSimbolo() + ", digite a coluna (0, 1 ou 2): ");
	             coluna = scanner.nextInt();
	         } while (!tabuleiro.verificarJogadaValida(linha, coluna));

	         tabuleiro.efetuarJogada(linha, coluna, jogadorAtual);
	     }

	     private void alternarJogador() {
	         jogadorAtual = (jogadorAtual.getSimbolo() == 'X') ? new Jogador('O') : new Jogador('X');
	     }
	 } 
}
