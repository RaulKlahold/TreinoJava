package com.github.raulklahold.treinointerface;

public class ClassificarMamifero extends CaracteristicaGeralAnimal implements interfacesom {
	public ClassificarMamifero(String nome) {
		super(nome);
	}

	@Override
	public void fazersom() {
		System.out.println("O mamífero " + nome + " faz au au!");

	}

	@Override
	public void dormir() {
		System.out.println("O mamífero " + nome + " está dormindo.");
	}

}
