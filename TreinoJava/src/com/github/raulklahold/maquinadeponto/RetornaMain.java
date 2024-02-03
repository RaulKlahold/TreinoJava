package com.github.raulklahold.maquinadeponto;

import java.util.Scanner;

public class RetornaMain {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	CapitacaoDados horario = new CapitacaoDados();
	
	System.out.print("Digite seu nome: ");
	String nome = scan.next();
	horario.setNome(nome);
	
	System.out.print("Digite seu setor: ");
	String setor = scan.next();
	horario.setSetor(setor);

	
	
	
	
	
	}

}
