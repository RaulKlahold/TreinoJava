package com.github.raulklahold.desfio;


import java.util.List;
import java.util.Scanner;


public class RetornaMain {
	 
	public static  void main(String[] args) {
	        GerenciadorTemperaturas gerenciador = new GerenciadorTemperaturas();
            Scanner scan = new Scanner(System.in);
            
	        System.out.println("Comparação de temperaturas\n");
	        System.out.println("\n--------------------------");
	        
	        System.out.println("Digite uma temperatura 1/5:  ");
	        double temp1 = scan.nextDouble();
	        gerenciador.adicionarTemperatura(temp1);
	        
	        System.out.println("Digite uma temperatura 2/5:  ");
	        double temp2 = scan.nextDouble();
	        gerenciador.adicionarTemperatura(temp2);
	        
	        System.out.println("Digite uma temperatura 3/5:  ");
	        double temp3 = scan.nextDouble();
	        gerenciador.adicionarTemperatura(temp3);
	        
	        
	        gerenciador.adicionarTemperatura(18.9);
	        gerenciador.adicionarTemperatura(22.0);
	        gerenciador.adicionarTemperatura(19.6); 

	      
	        gerenciador.ordenarTemperaturas();

	        
	        List<temperatura> maioresAcimaDaMedia = gerenciador.obterMaioresAcimaDaMedia();
	        System.out.println("Os dois maiores valores acima da média são:");
	        for (temperatura temp : maioresAcimaDaMedia) {
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

