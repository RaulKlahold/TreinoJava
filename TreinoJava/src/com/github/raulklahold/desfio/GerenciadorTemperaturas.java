package com.github.raulklahold.desfio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


	public class GerenciadorTemperaturas{
	    private List<temperatura> temperaturas;
	    
	   

	    public GerenciadorTemperaturas() {
	        this.temperaturas = new ArrayList<>();
	    }

	    public void adicionarTemperatura(double valor) {
	    
	        temperaturas.add(new temperatura(valor));
	    }

	    public List<temperatura> getTemperaturas() {
	        return temperaturas;
	    }

	    public void ordenarTemperaturas() {
	        Collections.sort(temperaturas);
	    }
	    
	    public double calcularMedia() {
	        double soma = 0;
	        for (temperatura temp : temperaturas) {
	            soma += temp.getTemp();
	        }
	        return soma / temperaturas.size();
	    }

	    public List<temperatura> obterMaioresAcimaDaMedia() {
	    	
	        List<temperatura> maioresAcimaDaMedia = new ArrayList<>();
	        double media = calcularMedia();
	        int count = 0;
	        
	        for (int i = temperaturas.size() -1; i >= 0; i--) {
	            temperatura temp = temperaturas.get(i);
	            if (temp.getTemp() > media) {
	                maioresAcimaDaMedia.add(temp);
	                count++;
	            }
	            if (count == 2) {
	                break;
	            }
	        }
	        return maioresAcimaDaMedia;
}}
