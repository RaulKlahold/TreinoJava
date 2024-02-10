package com.github.raulklahold.desfio;

import java.util.Collections;


public class RetornaMain {
	 
	public static  void main(String[] args) {
	        GerenciadorTemperaturas gerenciador = new GerenciadorTemperaturas();

	      
	        gerenciador.adicionarTemperatura(20.5);
	        gerenciador.adicionarTemperatura(15.7);
	        gerenciador.adicionarTemperatura(25.3);
	        gerenciador.adicionarTemperatura(18.9);
	        gerenciador.adicionarTemperatura(22.0);
	        gerenciador.adicionarTemperatura(19.6); 

	      
	        gerenciador.ordenarTemperaturas();

	       
	        for (temperatura temp : gerenciador.getTemperaturas()) {
	            System.out.println(temp);
	            
	            
	        }
	    }

}
class temperatura implements Comparable<temperatura>{
	private double Temp;
	
	public temperatura(double Temp) {
		this.Temp = Temp;
	}

	@Override
	public String toString() {
		return "temperatura [Temp=" + Temp + "]";
	}

	public double getTemp() {
		return Temp;
	}

	public void setTemp(int temp) {
		Temp = temp;
	}
	@Override
	public int compareTo(temperatura Temperatura) {
		return Double.compare(this.getTemp(), Temperatura.getTemp());
		
	}
	
	

}

