package com.github.raulklahold.treinoStream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RetornaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int var1 = scan.nextInt();

		System.out.println("Digite um outro numero: ");
		int var2 = scan.nextInt();

		System.out.println("Digite um outro numero: ");
		int var3 = scan.nextInt();

		System.out.println("Digite um outro numero: ");
		int var4 = scan.nextInt();

		System.out.println("Digite um outro numero: ");
		int var5 = scan.nextInt();

		System.out.println("Digite um outro numero: ");
		int var6 = scan.nextInt();

		System.out.println("Digite um outro numero: ");
		int var7 = scan.nextInt();
		scan.close();

		List<Integer> numeros = Arrays.asList(var1, var2, var3, var4, var5, var6, var7);
		/*
		 * Array.asList inicia uma lista com valores prédefinidos, no qual não podemos
		 * adicionar elementos na lista, se quiser ter esse poder de manipulação tem que
		 * setar uma nova list: List<Integer> lista = new ArrayList<>();
		 * 
		 */

		int somaDosParesDobrados = numeros.stream()
				.filter(n -> n > 2)
				.mapToInt(n -> (n * 2) / 2)
				.sum();
		
		
		/*
		 * O ponto e vírgula é colocado apenas após sum() porque é o método de terminal
		 * que finaliza a operação do Stream
		 */

		System.out.println("A soma deu: " + somaDosParesDobrados);

	}
}
