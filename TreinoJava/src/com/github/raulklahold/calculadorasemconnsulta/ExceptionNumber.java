package com.github.raulklahold.calculadorasemconnsulta;

public class ExceptionNumber extends Exception {
	
	public ExceptionNumber() {
		super("O numero precisa ser maior que 0! ");
	}

	public ExceptionNumber(String message) {
		super(message);
	}

}
