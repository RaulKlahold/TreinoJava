package com.github.raulklahold.treinandoCriacaoTxt;

import java.io.*;
import java.util.Scanner;

public class Exercicio2IOcaracter {

	public static void lerTecladoEscreverDocumento()throws IOException{
		System.out.println("Digite 3 recomendações de filmes: ");
		
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		
	    File f = new File("recomendações.txt");
	    BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));
	    
	    do {
	    	bw.write(line);
	    	bw.newLine();
            bw.flush();
            line = scan.nextLine();
           }
	    while(!(line.equalsIgnoreCase("fim")));
           
	    System.out.printf("Arquivo %s foi criado com sucesso!", f.getName());
	    
	    scan.close();
        bw.close();

	    
	}


public static void main(String[] args) throws IOException{
	lerTecladoEscreverDocumento();
	
}}
