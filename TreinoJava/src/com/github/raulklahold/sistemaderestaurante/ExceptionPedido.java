package com.github.raulklahold.sistemaderestaurante;

@SuppressWarnings("serial")
public class ExceptionPedido extends Exception {

	public ExceptionPedido() {
		super("O segundo parâmetro deve ser maior que o primeiro");
	}

	public ExceptionPedido(String message) {
		super(message);
	}}