package com.github.raulklahold.calculadorasemconnsulta;

public class ExecutaFunction {
	public static double soma(ColetarDados ColetarDados) throws ExceptionNumber {

		double numero1 = ColetarDados.getNum1();
		double numero2 = ColetarDados.getNum2();

		if (numero1 > 0 && numero2 > 0) {
			return numero1 + numero2;
		} else {
			throw new ExceptionNumber();
		}
	}

}
