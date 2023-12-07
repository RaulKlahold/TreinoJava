package com.github.raulklahold.tabuada;



public class ExecutarTabuada {
	public static double ExecutarCalculo(ColetarInfos ColetarInfos) {
        double PrimeiroNum = ColetarInfos.getNumero1();
        double SegundoNum = ColetarInfos.getNumero2();
  

        return PrimeiroNum * SegundoNum;
}
}