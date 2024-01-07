package com.github.raulklahold.sistemaderestaurante;

@SuppressWarnings("serial")
public class ExceptionCPF extends Exception {

	public ExceptionCPF() {
		super("CPF inexistente! ");
	}

	public ExceptionCPF(String message) {
		super(message);
	}
}