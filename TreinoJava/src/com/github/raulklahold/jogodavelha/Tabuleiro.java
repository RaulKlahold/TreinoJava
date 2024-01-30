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
		    public boolean verificarVitoria(Jogador jogador) {
		        for (int i = 0; i < 3; i++) {
		            if ((tabuleiro[i][0] == jogador.getSimbolo() && tabuleiro[i][1] == jogador.getSimbolo() && tabuleiro[i][2] == jogador.getSimbolo()) ||
		                (tabuleiro[0][i] == jogador.getSimbolo() && tabuleiro[1][i] == jogador.getSimbolo() && tabuleiro[2][i] == jogador.getSimbolo())) {
		                return true;
		            }
		        }

		        if ((tabuleiro[0][0] == jogador.getSimbolo() && tabuleiro[1][1] == jogador.getSimbolo() && tabuleiro[2][2] == jogador.getSimbolo()) ||
		            (tabuleiro[0][2] == jogador.getSimbolo() && tabuleiro[1][1] == jogador.getSimbolo() && tabuleiro[2][0] == jogador.getSimbolo())) {
		            return true;
		        }

		        return false;
		    }

		    public boolean verificarEmpate() {
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                if (tabuleiro[i][j] == ' ') {
		                    return false;
		                }
		            }
		        }
		        return true;
		    }
		} 

}
