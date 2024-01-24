package com.github.raulklahold.treinotwoitf;

import java.util.Scanner;

public class RetornaMain {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		ColetarDados dados = new ColetarDados();
        
        System.out.println("Digite um numero: ");
        double numU = scan.nextDouble();
        dados.setPrimeironumero(numU);
        
        System.out.println("Digite um numero: ");
        double numD = scan.nextDouble();
		dados.setSegundonumero(numD);
         scan.close();
		/*
		 * primeiro temos que instanciar o dados, para que assim o outro objeto tenha
		 * acesso a suas infos se n da conflito
		 */

		PersonaUM persona = new PersonaUM(dados);

		persona.soma();
		persona.subtracao();

		/*
		 * Quando você tem uma classe que depende de dados de outra classe para sua
		 * inicialização, você deve primeiro instanciar e configurar a classe que contém
		 * os dados, e em seguida, passar essa instância para a classe dependente.
		 * 
		 * No seu caso, a classe PersonaUM depende dos dados contidos em uma instância
		 * de ColetarDados. Portanto, é necessário primeiro criar uma instância de
		 * ColetarDados, configurar os valores necessários nessa instância e, em
		 * seguida, passar essa instância para o construtor de PersonaUM.
		 * 
		 * Essa abordagem ajuda a evitar conflitos e a garantir que a classe PersonaUM
		 * tenha os dados necessários para realizar suas operações quando é instanciada.
		 * O código corrigido no meu comentário anterior reflete essa sequência correta
		 * de criação e configuração de objetos.
		 */
	}

}
