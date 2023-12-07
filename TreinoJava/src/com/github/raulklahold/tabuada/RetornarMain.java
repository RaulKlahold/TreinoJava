package com.github.raulklahold.tabuada;

import java.text.DecimalFormat;
import java.util.Scanner;


public class RetornarMain {

	public static void main(String[] args) {
		ColetarInfos calculo = new ColetarInfos();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero para a multiplicação: ");
        double primeiroNum = scanner.nextDouble();
          calculo.setNumero1(primeiroNum);
		

		System.out.print("Digite um segundo numero para a multiplicação: ");
        double segundoNumero = scanner.nextDouble();
		calculo.setNumero2(segundoNumero);
		scanner.close();
		
		double novoNum = ExecutarTabuada.ExecutarCalculo(calculo);
		
		DecimalFormat df = new DecimalFormat("#.00");
        String novoCapitalFormatado = df.format(novoNum);
		
		System.out.println("A multiplicação do numero: "+calculo.getNumero1()+" e "+calculo.getNumero2());
		System.out.println("Irá resultar no valor: "+novoCapitalFormatado);
		
		

	}

}
