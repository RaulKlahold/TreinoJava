package com.github.raulklahold.calculadorainvestimentos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RetornarMain {

	public static void main(String[] args) {
		try {
			ColetarDados investimento = new ColetarDados();
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite o capital inicial que quer investir: ");
	        double capitalInicial = scanner.nextDouble();
			investimento.setcapital(capitalInicial);
			

			System.out.print("Digite a Taxa ao mês que o capital irá render: ");
	        double taxaAm = scanner.nextDouble();
			investimento.setjurosAm(taxaAm);
			
			System.out.print("Digite a quantidade de meses que o capital irá render: ");
	        int quantidadeMes = scanner.nextInt();
			investimento.setMesesInvestidos(quantidadeMes);
			scanner.close();
			
			double novoCapital = ExecutarCalculo.realizarInvestimento(investimento);
			
			DecimalFormat df = new DecimalFormat("#.00");
	        String novoCapitalFormatado = df.format(novoCapital);
			
			System.out.println("Seu capital investido a: " + investimento.getcapital());
			System.out.println("Sob uma taxa de: "+investimento.getjurosAm());
			System.out.println("ira render: "+ novoCapitalFormatado);
		    
		} catch (ArithmeticException e) {
		    System.out.println("Erro ao realizar cálculo: divisão por zero.");
		} catch (NumberFormatException e) {
		    System.out.println("Por favor, insira um número válido.");
		} catch (Exception e) {
		    System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
		}

		
		
		
	}

}
