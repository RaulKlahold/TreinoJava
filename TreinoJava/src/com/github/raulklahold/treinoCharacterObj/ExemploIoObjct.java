package com.github.raulklahold.treinoCharacterObj;

import java.io.*;

public class ExemploIoObjct {
	
	public static void serealizacao() throws IOException{
		Carro carro = new Carro("Mustang", 198, 1998, "Preto");
		
		File f = new File("Carro");
	}

}
/*
private String marca;
private Integer VelocidadeMax;
private Integer ano;
private String cor;
*/