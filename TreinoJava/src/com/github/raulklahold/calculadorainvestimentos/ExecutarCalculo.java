package com.github.raulklahold.calculadorainvestimentos;


public class ExecutarCalculo {

	public class ManipuladorInvestimento {

	    public static void realizarInvestimento(ColetarDados ColetarDados) {
	      
	    	double capitalAtual = ColetarDados.getcapital();
	        double jurosAm = ColetarDados.getjurosAm();
	        int mesesInvestidos = ColetarDados.getmesesInvestidos();
	        
	        @SuppressWarnings("unused")
			double novoCapital = capitalAtual * Math.pow((1 + jurosAm), mesesInvestidos);
	        
	        
	        
	    }

	
	
	
	 
	}
}
