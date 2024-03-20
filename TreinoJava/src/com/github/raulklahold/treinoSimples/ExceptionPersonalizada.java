package com.github.raulklahold.treinoSimples;

public class ExceptionPersonalizada extends Exception {
	
	public ExceptionPersonalizada() {
		super("O nome precisa ter no minimo 3 caracteres: ");
	}

	public ExceptionPersonalizada(String message) {
		super(message);
	}

}
