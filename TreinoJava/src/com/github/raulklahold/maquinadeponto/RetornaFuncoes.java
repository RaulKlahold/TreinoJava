package com.github.raulklahold.maquinadeponto;
import java.time.LocalTime;
import java.time.Duration;

public class RetornaFuncoes {
	
	

	   
	        // Criar duas instâncias de LocalTime
	        LocalTime hora1 = LocalTime.of(10, 30, 0); // 10:30:00
	        LocalTime hora2 = LocalTime.of(14, 45, 30); // 14:45:30

	        // Calcular a diferença entre as duas horas
	        Duration diferenca = Duration.between(hora1, hora2);

	        // Exibir a diferença em horas, minutos e segundos
	        long horas = diferenca.toHours();
	        long minutos = diferenca.toMinutesPart();
	        long segundos = diferenca.toSecondsPart();

	        
	    
	}


