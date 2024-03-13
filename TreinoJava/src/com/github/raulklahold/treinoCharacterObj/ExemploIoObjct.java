package com.github.raulklahold.treinoCharacterObj;

import java.io.*;

public class ExemploIoObjct {
	
	public static void serealizacao() throws IOException{
		Carro carro = new Carro("Mustang", 198, 1998, "Preto");
		
		File f = new File("Carro");
		
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(f.getName()));
		
		oss.writeObject(carro);
		System.out.printf("Arquivo %s criado com sucesso! Tamanho %d bytes.", f.getName(), f.length());
		
		oss.close();
	}
	
	public static void desserializacao(String arquivo) throws IOException, ClassNotFoundException{
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
		Carro objetoCarro = (Carro) ois.readObject();
		
		   System.out.printf("\nMarca..................: %s\n", objetoCarro.getMarca());
	       System.out.printf("Velocidade................: %d\n", objetoCarro.getVelocidadeMax());
	       System.out.printf("Ano...................: %d\n", objetoCarro.getAno());
	       System.out.printf("Cor.....................: %s\n", objetoCarro.getCor());
	       System.out.println(objetoCarro);
	       
	       
	       ois.close();
	}
	

}
/*
private String marca;
private Integer VelocidadeMax;
private Integer ano;
private String cor;
*/