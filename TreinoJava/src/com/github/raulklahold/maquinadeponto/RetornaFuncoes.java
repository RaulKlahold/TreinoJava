package com.github.raulklahold.maquinadeponto;
import java.time.LocalTime;
import java.time.Duration;

public class RetornaFuncoes {
	
	

	   
	        LocalTime hora1 = LocalTime.of(10, 30, 0); 
	        LocalTime hora2 = LocalTime.of(14, 45, 30);

	        
	        Duration diferenca = Duration.between(hora1, hora2);

	       
	        long horas = diferenca.toHours();
	        long minutos = diferenca.toMinutesPart();
	        
	        
	    
	}


