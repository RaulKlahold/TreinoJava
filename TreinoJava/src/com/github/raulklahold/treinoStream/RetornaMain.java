package com.github.raulklahold.treinoStream;

import java.util.Arrays;
import java.util.List;

public class RetornaMain {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		/*
		 * Array.asList inicia uma lista com valores prédefinidos, 
		 * no qual não podemos
		 * adicionar elementos na lista, se quiser ter esse poder
		 *  de manipulação tem que
		 * setar uma nova list: List<Integer> lista = new ArrayList<>();
		 * 
		 */

		int somaDosParesDobrados = numeros.stream()
				.filter(n -> n > 1)
				.mapToInt(n -> (n * 2) / 2)
				.sum(); 
		/*
		* O ponto e vírgula é colocado apenas após sum()
		*  porque é o método de terminal
		* que finaliza a operação do Stream
			*/

		System.out.println("A soma deu: " + somaDosParesDobrados);

	}
}
