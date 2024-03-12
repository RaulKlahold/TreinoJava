package com.github.raulklahold.treinandoCriacaoTxt;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio2IOcaracter {

	public static void lerTecladoEscreverDocumento()throws IOException{
		System.out.println("Digite 3 recomendações de filmes: ");
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		
	    File f = new File("recomendações.txt");
	}
}
