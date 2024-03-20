package com.github.raulklahold.treinoSimples;

public class ExceptionPersonalizada extends Exception {
	
	public ExceptionPersonalizada() {
		super("O numero precisa ser maior que 0! ");
	}

	public ExceptionPersonalizada(String message) {
		super(message);
	}

}
