package com.github.raulklahold.desfio;


public class RetornaMain {



}
class temperatura implements Comparable<temperatura>{
	private double Temp;
	
	public temperatura(double Temp) {
		this.Temp = Temp;
	}

	@Override
	public String toString() {
		return "temperatura [Temp=" + Temp + "]";
	}

	public double getTemp() {
		return Temp;
	}

	public void setTemp(int temp) {
		Temp = temp;
	}
	@Override
	public int compareTo(temperatura Temperatura) {
		return Double.compare(this.getTemp(), Temperatura.getTemp());
		
	}
}
