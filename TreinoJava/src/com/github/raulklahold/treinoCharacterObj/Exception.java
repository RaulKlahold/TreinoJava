package com.github.raulklahold.treinoCharacterObj;

public class ExceptioNome extends Exception {
	
	public ExceptioNome() {
		super(" Nome tem que sair maior que 3 chars");
	}

	public ExceptioNome(String message) {
		super(message);
	}
}


