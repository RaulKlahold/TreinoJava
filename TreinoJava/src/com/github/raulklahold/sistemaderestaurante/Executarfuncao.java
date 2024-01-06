package com.github.raulklahold.sistemaderestaurante;


public class Executarfuncao {
	
	public static String Pedidoslist(ColetarDados ColetarDados){
	
	 String nome = ColetarDados.getNome();
	 String CPF = ColetarDados.getCpf();
	 char pedido = ColetarDados.getPedido();
	 
	 
	 switch (pedido) {
     case '1':
         System.out.println("Nome: " + nome);
         System.out.println("CPF: " + CPF);
         System.out.println("Pedido escolhido: " + pedido);
         // Aqui você pode adicionar qualquer lógica específica para o "Pedido A" se necessário
         break;
     case '2':
         System.out.println("Nome: " + nome);
         System.out.println("CPF: " + CPF);
         System.out.println("Pedido escolhido: " + pedido);
         // Lógica específica para o "Pedido B" se necessário
         break;
     case '3':
         System.out.println("Nome: " + nome);
         System.out.println("CPF: " + CPF);
         System.out.println("Pedido escolhido: " + pedido);
         // Lógica específica para o "Pedido C" se necessário
         break;
     default:
    	 
         System.out.println("Pedido não reconhecido.");
         break;
	 }
         return pedido;
}}
