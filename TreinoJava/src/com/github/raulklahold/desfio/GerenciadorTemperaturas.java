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
}
