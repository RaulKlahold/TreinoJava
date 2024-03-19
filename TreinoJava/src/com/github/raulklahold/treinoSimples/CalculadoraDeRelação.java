package com.github.raulklahold.treinoSimples;

public class CalculadoraDeRelação {
	public static double CalculadoraDeRelação(ColetarDados ColetarDados) {
		
		double primeiraVariavel = ColetarDados.getNumero1();
		double segundaVariavel = ColetarDados.getNumero2();
		
		 return ((primeiraVariavel - segundaVariavel)/ segundaVariavel) * 100; 
		
		
	}
      
}
