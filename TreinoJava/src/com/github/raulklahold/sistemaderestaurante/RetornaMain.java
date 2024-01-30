package com.github.raulklahold.sistemaderestaurante;

import java.util.Scanner;



public class RetornaMain {

	public static void main(String[] args) throws ExceptionCPF, ExceptionPedido, ExceptionNome {
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
		

		try {
		Executarfuncao.Pedidoslist(cliente);
		System.out.println("\n Obrigado pela Preferência!");
		}
		catch (ExceptionNome  e) {
			System.out.println(e.getMessage());
		}
		catch (ExceptionCPF f) {
			System.out.println(f.getMessage());
		}
		catch (ExceptionPedido g) {
			System.out.println(g.getMessage());
		}

}}
