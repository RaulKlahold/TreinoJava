package com.github.raulklahold.treinointerface;

public class Retornamain {

	public static void main(String[] args) {
		
        try {
        	ClassificarAves ave = new ClassificarAves(null);
    		ClassificarMamifero mamifero = new ClassificarMamifero(null);
    		ClassificarRepiteis Reptil = new ClassificarRepiteis(null);
    		
    		System.out.println("Essa é a classificação e suas habilidades: ");
    		
    		ave.nome = "Papagaio";
    		ave.dormir();
            ave.fazersom();

            mamifero.nome = "Cachorro";
            mamifero.dormir();
            mamifero.fazersom();
            
            Reptil.nome = "Jacaré";
            Reptil.dormir();
            Reptil.fazersom();
            
        
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }

	}

}
