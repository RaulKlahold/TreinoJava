package com.github.raulklahold.treinotwoitf;

public class PersonaUM implements ExecutandoFunctions {
    private double numeroP;
    private double numeroS;

    public PersonaUM(ColetarDados coletarDados) {
        this.numeroP = coletarDados.getPrimeironumero();
        this.numeroS = coletarDados.getSegundonumero();
    }

    @Override
    public void soma() {
        double resultado = numeroP + numeroS;
        System.out.println("A soma é: " + resultado);
    }

    @Override
    public void subtracao() {
        double resultado = numeroP - numeroS;
        System.out.println("A subtração é: " + resultado);
    }
}
