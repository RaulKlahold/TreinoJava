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
         System.out.println("Pedido N°1  \n XBacon duplo com fritas \n Lata Coca Brind\n ");
         break;
     case "2":
    	 System.out.println("\nNome: " + nome+"\n");
         System.out.println("\nCPF: " + CPF+"\n");
         System.out.println("Pedido escolhido: " + pedido+"\n");
         System.out.println("Pedido N°2  \n XSalada duplo com fritas \n Lata fanta Brind\n ");
         break;
     case "3":
    	 System.out.println("\nNome: " + nome+"\n");
         System.out.println("\nCPF: " + CPF+"\n");
         System.out.println("Pedido escolhido: " + pedido+"\n");
         System.out.println("Pedido N°1  \n XEgg duplo com fritas \n Lata Sprite Brind\n ");
         break;
     default:
    	 
         System.out.println("Pedido não reconhecido.");
         break;
	 }
         return pedido;
}}
