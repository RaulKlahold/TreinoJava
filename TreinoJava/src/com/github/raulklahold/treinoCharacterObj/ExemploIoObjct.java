package com.github.raulklahold.treinoCharacterObj;

import java.io.*;

public class ExemploIoObjct {
	
	public static void serealizacao() throws IOException{
		Carro carro = new Carro("Mustang", 198, 1998, "Preto");
		
		File f = new File("Carro");
		
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(f.getName()));
		
		oss.writeObject(carro);
		System.out.printf("Arquivo %s criado com sucesso! Tamanho %d bytes.", f.getName(), f.length());
		
	}

}
/*
private String marca;
private Integer VelocidadeMax;
private Integer ano;
private String cor;
*/