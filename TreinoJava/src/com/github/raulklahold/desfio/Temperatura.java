package com.github.raulklahold.desfio;

import java.util.ArrayList;
import java.util.List;

public class Temperatura {
	public Temperatura(List<Temperatura> listaArray) {
		super();
		this.listaArray = listaArray;
	}
	List<Temperatura> listaArray = new ArrayList<>();
	{
		{
		add(new Temperatura(30));
		
		add(new Temperatura(30));
		add(new Temperatura(30));
		add(new Temperatura(30));
		add(new Temperatura(30));
		add(new Temperatura(30));
		}
	}

		
	}

}
