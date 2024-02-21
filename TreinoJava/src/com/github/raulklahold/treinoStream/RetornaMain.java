package com.github.raulklahold.treinoStream;

import java.util.Arrays;
import java.util.List;

public class RetornaMain {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);
		
		int somaDosParesDobrados = numeros.stream()
		       .filter(n -> n % 2 == 0)
		       .mapToInt(n -> n * 2)
		       .sum();
		       System.out.println("A soma deu"+somaDosParesDobrados);

	

}}
