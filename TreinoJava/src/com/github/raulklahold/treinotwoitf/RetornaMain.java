package com.github.raulklahold.treinotwoitf;

public class RetornaMain {

	public static void main(String[] args) {
		ColetarDados dados = new ColetarDados();

		dados.setPrimeironumero(30.0);
		dados.setSegundonumero(40.0);

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
