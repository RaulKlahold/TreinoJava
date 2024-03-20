package com.github.raulklahold.treinoSimples;

public class CalculadoraDeRelação {
	public static double Relacao(ColetarDados ColetarDados){
		
		double primeiraVariavel = ColetarDados.getNumero1();
		double segundaVariavel = ColetarDados.getNumero2();
		
		if(primeiraVariavel > 0 && segundaVariavel > 0 ) {
		
		 return ((primeiraVariavel - segundaVariavel)/ segundaVariavel) * 100; 
		}
		else {
			
		}
		
	}
      
}
