package com.github.raulklahold.treinoSimples;

import java.util.Scanner;

public class RetornoDaMain {

	public static void main(String[] args) throws ExceptionPersonalizada {
		ColetarDados dados = new ColetarDados();
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o numero inicial: ");
		double firstN = scan.nextDouble();
		dados.setNumero1(firstN);

		System.out.println("Digite um numero final");
		double secondN = scan.nextDouble();
		dados.setNumero2(secondN);
		try {
			double resultante = CalculadoraDeRelação.Relacao(dados);
			System.out.println(resultante);
		} catch (ExceptionPersonalizada e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}

}
