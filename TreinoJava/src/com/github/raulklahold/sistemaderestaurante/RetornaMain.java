package com.github.raulklahold.sistemaderestaurante;

import java.util.Scanner;

public class RetornaMain {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		ColetarDados cliente = new ColetarDados();

		System.out.println("Por favor digite seu nome: ");
		String nome = Scan.nextLine();
		cliente.setNome(nome);

		System.out.println("Por favor digite seu CPF: ");
		String CPf = Scan.nextLine();
		cliente.setCpf(CPf);

		System.out.println("Por favor digite o numero do seu pedido: ");
		String pedido = Scan.nextLine();
		cliente.setPedido(pedido);
		Scan.close();

		String novopedido = Executarfuncao.Pedidoslist(cliente);
		System.out.println("\n Muito obrigado pela preferência...\nseu pedido foi o combo:\n"+novopedido );

	}

}
