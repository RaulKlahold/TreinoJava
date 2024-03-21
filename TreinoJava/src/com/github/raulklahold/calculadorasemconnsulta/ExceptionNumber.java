package com.github.raulklahold.calculadorasemconnsulta;

@SuppressWarnings("serial")
public class ExceptionNumber extends Exception {

	public ExceptionNumber() {
		super("O numero precisa ser maior que 0! ");
	}

	public ExceptionNumber(String message) {
		super(message);
	}

}
