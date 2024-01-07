package com.github.raulklahold.sistemaderestaurante;
@SuppressWarnings("serial")
public class ExceptionNome extends Exception {

	public ExceptionNome() {
		super("O nome precisa ter no minimo 3 caracteres: ");
	}

	public ExceptionNome(String message) {
		super(message);
	}
}