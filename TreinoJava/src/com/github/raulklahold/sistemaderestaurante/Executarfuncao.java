package com.github.raulklahold.sistemaderestaurante;


public class Executarfuncao {
	
	public static String Pedidoslist(ColetarDados ColetarDados){
	
	 String nome = ColetarDados.getNome();
	 String CPF = ColetarDados.getCpf();
	 String pedido = ColetarDados.getPedido();
	 
	 
	 switch (pedido) {
     case "1":
         System.out.println("\nNome: " + nome+"\n");
         System.out.println("\nCPF: " + CPF+"\n");
         System.out.println("Pedido escolhido: " + pedido+"\n");
         System.out.println("");
         break;
     case "2":
    	 System.out.println("\nNome: " + nome+"\n");
         System.out.println("\nCPF: " + CPF+"\n");
         System.out.println("Pedido escolhido: " + pedido+"\n");
         System.out.println("");
         break;
     case "3":
    	 System.out.println("\nNome: " + nome+"\n");
         System.out.println("\nCPF: " + CPF+"\n");
         System.out.println("Pedido escolhido: " + pedido+"\n");
         System.out.println("");
         break;
     default:
    	 
         System.out.println("Pedido não reconhecido.");
         break;
	 }
         return pedido;
}}
