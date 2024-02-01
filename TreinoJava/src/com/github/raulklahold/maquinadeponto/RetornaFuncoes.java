package com.github.raulklahold.maquinadeponto;


public class RetornaFuncoes {
	
	public static String HorarioDeTrabalho(CapitacaoDados CapitacaoDados) {

	    double hora1 = CapitacaoDados.getHorarioentrada();
	    double hora2 = CapitacaoDados.getHorariosaida();
	    
	    double diferenca = hora2 - hora1;
	    String horacontabilizada;
	    
	    if(diferenca >= 8) {
	    	horacontabilizada = "Carga horaria completa";
	    }else {
	    	horacontabilizada = "Carga horaria incompleta";
	    }
	    
	        return horacontabilizada;
	     
	        
	}
	    
	}


