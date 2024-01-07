package com.github.raulklahold.sistemaderestaurante;

import com.github.raulklahold.DesafioControleFluxo.Exceptions;

public class Executarfuncao {

	public static String Pedidoslist(ColetarDados ColetarDados) throws ExceptionNome, ExceptionCPF, ExceptionPedido {

		String nome = ColetarDados.getNome();
		String CPF = ColetarDados.getCpf();
		String pedido = ColetarDados.getPedido();

		if(nome.length() < 3) {
			throw new ExceptionNome();
		}
		else if(CPF.length() < 11) {
			throw new ExceptionCPF();
			
		}
		else if(pedido.length() > 1) {
			throw new ExceptionPedido();
		}
		else {
		switch (pedido) {
		case "1":
			System.out.println("\n ----- Informação do pedido -----\n");
			System.out.println("\n Nome: " + nome);
			System.out.println("\n CPF: " + CPF);
			System.out.println("\n Pedido escolhido: " + pedido);
			System.out.println("\n Pedido N°1  \n XBacon duplo com fritas \n Lata Coca Brinde\n ");
			break;
		case "2":
			System.out.println("\n ----- Informação do pedido -----\n");
			System.out.println("\n Nome: " + nome);
			System.out.println("\n CPF: " + CPF);
			System.out.println("\n Pedido escolhido: " + pedido);
			System.out.println("\n Pedido N°2  \n XSalada duplo com fritas \n Lata fanta Brinde\n ");
			break;
		case "3":
			System.out.println("\n ----- Informação do pedido -----\n");
			System.out.println("\n Nome: " + nome);
			System.out.println("\n CPF: " + CPF);
			System.out.println("\n Pedido escolhido: " + pedido);
			System.out.println("\n Pedido N°3  \n XEgg duplo com fritas \n Lata Sprite Brinde\n ");
			break;
		default:

			System.out.println("Pedido não encontrado");
			break;
		}}
		return pedido;
	}
}
