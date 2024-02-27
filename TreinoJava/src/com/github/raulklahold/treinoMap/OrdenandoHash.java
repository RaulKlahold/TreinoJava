package com.github.raulklahold.treinoMap;
import java.util.HashMap;
import java.util.Scanner;

public class OrdenandoHash {


			public static void main(String[] args) {
				
			
		        HashMap<Integer, String> mapaNomes = new HashMap<>();
		        Scanner scan = new Scanner(System.in);
		        
		        System.out.println("Digite um nome: ");
		        String nome1 = scan.next();
		        mapaNomes.put(1, nome1);
		        
		        mapaNomes.put(2, "Maria do Carmo");
		        mapaNomes.put(3, "Claudinei Silva");
		        mapaNomes.put(4, "Amélia Mourão");

		        //comparatorInts compInt = new comparatorInts(mapaNomes);

		        //Map<Integer, String> mapaOrdenado = new TreeMap<>();
		        //mapaOrdenado.putAll(mapaNomes);

		        for(Integer valor : mapaNomes.keySet()){
		            System.out.println(valor + " " + mapaNomes.get(valor));
		        }
		    }

}
