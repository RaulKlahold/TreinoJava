package com.github.raulklahold.jogodavelha;


	 public class Tabuleiro {

		    private char[][] tabuleiro;

		    public Tabuleiro() {
		        tabuleiro = new char[3][3];
		        inicializar();
		    }

		    private void inicializar() {
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                tabuleiro[i][j] = ' ';
		            }
		        }
		    }

		    public void exibir() {
		        System.out.println("-------------");
		        for (int i = 0; i < 3; i++) {
		            System.out.print("| ");
		            for (int j = 0; j < 3; j++) {
		                System.out.print(tabuleiro[i][j] + " | ");
		            }
		            System.out.println();
		            System.out.println("-------------");
		        }
		    }

		    public boolean verificarJogadaValida(int linha, int coluna) {
		        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || tabuleiro[linha][coluna] != ' ') {
		            System.out.println("Jogada inválida. Tente novamente.");
		            return false;
		        }
		        return true;
		    }

		    public void efetuarJogada(int linha, int coluna, Jogador jogador) {
		        tabuleiro[linha][coluna] = jogador.getSimbolo();
		    }

}
