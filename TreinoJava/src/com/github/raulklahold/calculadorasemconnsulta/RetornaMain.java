package com.github.raulklahold.calculadorasemconnsulta;

import java.util.Scanner;
 class RetornaMain {
    
	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(System.in);
		ColetarDados cal = new ColetarDados();
		
		System.out.println("Digite um numero: ");
		double var1 = scan.nextDouble();
		cal.setNum1(var1);
		
		System.out.println("Digite um segundo numero: ");
		double var2 = scan.nextDouble();
		cal.setNum2(var2);
		scan.close();

       Double resultado = ExecutaFunction.soma(cal);
       System.out.println("O resultado deu: "+resultado);
       
	} catch(ArithmeticException j) {

		System.out.println("Erro ao realizar cálculo: não é possivel divisão por zero.");
	} catch (NumberFormatException k) {
		System.out.println("Erro ao realizar cálculo: Por favor, insira um número válido.");
	} 
	}}
	

