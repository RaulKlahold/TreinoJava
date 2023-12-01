package calculadoraimc;

public class DadosCalculos {
	private double altura;
	private double peso;

	public void setaltura(double Novoaltura) {
		this.altura = Novoaltura;
	}

	public void setpeso(double Novopeso) {
		this.peso = Novopeso;
	}

	public double calcularIMC() {
		return peso / (altura * altura);
	}

	public double getIMC() {
		return calcularIMC();
	}

	public static String avaliarCategoriaIMC(double novoIMC) {
		if (novoIMC < 18.5) {
			return "Seu IMC é 18.5 então sua classificação é de: Magreza";
		} else if (novoIMC > 18.5 && novoIMC < 25 ) {
			return "Seu IMC é 25.0 então sua classificação é de: Peso normal";
		} else if (novoIMC > 25 && novoIMC < 30) {
			return "Seu IMC é 30.0 então sua classificação é de: Sobrepeso";
		} else if (novoIMC > 30 &&novoIMC < 35) {
			return "Seu IMC é 35.0 então sua classificação é de: Obesidade grau I";
		} else if (novoIMC > 35 && novoIMC < 40) {
			return "Seu IMC é 40.0 então sua classificação é de: Obesidade grau II";
		} else {
			return "Seu IMC é maior que 40.0 então sua classificação é de: Obesidade grau III";
		}

	}
}
