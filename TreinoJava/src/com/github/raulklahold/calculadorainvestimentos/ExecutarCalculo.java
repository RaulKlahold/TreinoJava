package com.github.raulklahold.calculadorainvestimentos;


public class ExecutarCalculo {

	public static double realizarInvestimento(ColetarDados coletarDados) {
        double capitalAtual = coletarDados.getCapital();
        double jurosAm = coletarDados.getJurosAm();
        double mesesInvestidos = coletarDados.getMesesInvestidos();

        return capitalAtual * Math.pow((1 + jurosAm), mesesInvestidos);
    }
	        
	        
	        
	   }

