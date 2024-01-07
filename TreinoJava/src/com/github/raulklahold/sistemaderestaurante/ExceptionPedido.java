package com.github.raulklahold.sistemaderestaurante;

@SuppressWarnings("serial")
public class ExceptionPedido extends Exception {

	public ExceptionPedido() {
		super("Só é permitido apenas 1 pedido por vez!");
	}

	public ExceptionPedido(String message) {
		super(message);
	}}