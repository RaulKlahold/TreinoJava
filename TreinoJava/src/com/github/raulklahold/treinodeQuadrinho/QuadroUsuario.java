package com.github.raulklahold.treinodeQuadrinho;

import javax.swing.JOptionPane;

public class QuadroUsuario {

	public static void main(String[] args) {
		
		String numeroX = JOptionPane.showInputDialog("Qual é o seu primeiro numero?");
		String numeroY = JOptionPane.showInputDialog("Qual é o seu segundo numero?");
		
		double numeroUm = Double.parseDouble(numero1);
		double numeroDois = Double.parseDouble(numero2);
		
		double divisao = numeroUm / numeroDois;
		System.out.println("A divisão deu: "+divisao);
		
		
		
	}

}
