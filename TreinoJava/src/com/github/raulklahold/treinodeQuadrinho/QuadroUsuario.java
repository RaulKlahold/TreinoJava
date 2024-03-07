package com.github.raulklahold.treinodeQuadrinho;

import javax.swing.JOptionPane;

public class QuadroUsuario {

	public static void main(String[] args) {
		
		String numeroX = JOptionPane.showInputDialog("Qual é o seu primeiro numero?");
		String numeroY = JOptionPane.showInputDialog("Qual é o seu segundo numero?");
		
		double numero1 = Double.parseDouble(numeroX);
		double numero2 = Double.parseDouble(numeroY);
		
		double divisao = numeroUm / numeroDois;
		System.out.println("A divisão deu: "+divisao);
		
		
		
	}

}
