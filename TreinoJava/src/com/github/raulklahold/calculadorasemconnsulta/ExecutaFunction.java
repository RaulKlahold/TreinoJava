package com.github.raulklahold.calculadorasemconnsulta;

public class ExecutaFunction {
	public static double soma(ColetarDados ColetarDados) throws ExceptionNumber{

		double numero1 = ColetarDados.getNum1();
		double numero2 = ColetarDados.getNum2();
		
      
		return numero1 + numero2;

	}

}
