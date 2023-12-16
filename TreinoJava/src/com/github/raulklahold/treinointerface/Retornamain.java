package com.github.raulklahold.treinointerface;

public class Retornamain {

	public static void main(String[] args) {
		ClassificarAves ave = new ClassificarAves(null);
		ClassificarMamifero mamifero = new ClassificarMamifero(null);
		
		System.out.println("Essa é a classificação e suas habilidades: ");
		
		ave.nome = "Papagaio";
		ave.dormir();
        ave.fazersom();

        mamifero.nome = "Cachorro";
        mamifero.dormir();
        mamifero.fazersom();
	}

}
