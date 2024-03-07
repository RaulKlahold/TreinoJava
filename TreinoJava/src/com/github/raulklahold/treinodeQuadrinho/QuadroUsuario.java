package com.github.raulklahold.treinodeQuadrinho;

import javax.swing.JOptionPane;

public class QuadroUsuario {

	public static void main(String[] args) {
		
		String numero1 = JOptionPane.showInputDialog("Qual é o seu primeiro numero?");
		String numero2 = JOptionPane.showInputDialog("Qual é o seu segundo numero?");
		
		double numeroUm = Double.parseDouble(numero1);
		double numeroDois = Double.parseDouble(numero2);
		
		double divisão = numeroUm / numeroDois;
		System.out.println();
	}

}
