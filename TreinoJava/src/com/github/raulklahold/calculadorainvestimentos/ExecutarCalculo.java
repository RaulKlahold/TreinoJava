package com.github.raulklahold.calculadorainvestimentos;


public class ExecutarCalculo {

	public class ManipuladorInvestimento {

	    public static void realizarInvestimento(ColetarDados ColetarDados) {
	      
	    	double capitalAtual = ColetarDados.getcapital();
	        double jurosAm = ColetarDados.getjurosAm();
	        double mesesInvestidos = ColetarDados.getmesesInvestidos();
	        
	        double novoCapital = capitalAtual * Math.pow((1 + jurosAm), mesesInvestidos);
	        ColetarDados.setcapital(novoCapital);
	        ColetarDados.setmesesInvestidos(mesesInvestidos + 1);
	        System.out.println("mensagem de teste da nova branch");
	    }

	
	
	
	 
	}
}
