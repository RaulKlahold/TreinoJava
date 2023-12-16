package com.github.raulklahold.treinointerface;

public class ClassificarAves extends CaracteristicaGeralAnimal implements interfacesom {
	public ClassificarAves(String nome) {
		super(nome);
	}

	@Override
	public void fazersom() {
		System.out.println("A ave " + nome + " Faz PIU PIU (segundo a Lumena)!");

	}

	@Override
	public void dormir() {
		System.out.println("A ave " + nome + " está dormindo.");
	}

}
