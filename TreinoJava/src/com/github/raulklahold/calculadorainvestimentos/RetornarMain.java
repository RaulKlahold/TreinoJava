package com.github.raulklahold.calculadorainvestimentos;

import java.util.Scanner;

public class RetornarMain {

	public static void main(String[] args) {
		
		ColetarDados investimento = new ColetarDados();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o capital inicial que quer investir: ");
        double capitalInicial = scanner.nextDouble();
		investimento.setcapital(capitalInicial);
		

		System.out.print("Digite a Taxa ao mês que o capital irá render: ");
        double taxaAm = scanner.nextDouble();
		investimento.setjurosAm(taxaAm);
		
		System.out.print("Digite a quantidade de meses que o capital irá render: ");
        double quantidadeMes = scanner.nextDouble();
		investimento.setmesesInvestidos(quantidadeMes);
		scanner.close();
		
		double novoCapital = investimento.getcapital();
		System.out.println("Seu capital investido a: " + investimento.getcapital());
		System.out.println("Sob uma taxa de: "+investimento.getjurosAm());
		System.out.println("ira render: "+ novoCapital);
		
		
		System.out.println("mensagem de teste da nova branch");
	
	}

}
