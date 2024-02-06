package com.github.raulklahold.maquinadeponto;

import java.util.Scanner;

public class RetornaMain {
	public static void main(String[] args) {
		try {
	Scanner scan = new Scanner(System.in);
	CapitacaoDados horario = new CapitacaoDados();
	
	System.out.print("Digite seu nome: ");
	String nome = scan.next();
	horario.setNome(nome);
	
	System.out.print("Digite seu setor: ");
	String setor = scan.next();
	horario.setSetor(setor);
	
	System.out.println("Digite seu horario de entrada: ");
	double horarioE = scan.nextDouble();
	horario.setHorarioentrada(horarioE);
	
	System.out.println("Digite o horario de saida: ");
	double horarioS = scan.nextDouble();
	horario.setHorariosaida(horarioS);
	
	scan.close();
	
	String cargahoraria = RetornaFuncoes.HorarioDeTrabalho(horario);
    System.out.println(cargahoraria);
		} catch (ArithmeticException e) {

			System.out.println("Erro ao realizar cálculo: não é possivel divisão por zero.");
		} catch (NumberFormatException e) {
			System.out.println("Erro ao realizar cálculo: Por favor, insira um número válido.");
		} catch (Exception e) {
			System.out.println("Erro ao realizar cálculo: Ocorreu um erro inesperado " + e.getMessage());
		}

	
	
	
	
	}

}
