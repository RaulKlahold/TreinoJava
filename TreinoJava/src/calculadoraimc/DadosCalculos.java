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
			return "Classificação: Magreza";
		} else if (novoIMC < 25) {
			return "Classificação: Peso normal";
		} else if (novoIMC < 30) {
			return "Classificação: Sobrepeso";
		} else if (novoIMC < 35) {
			return "Classificação: Obesidade grau I";
		} else if (novoIMC < 40) {
			return "Classificação: Obesidade grau II";
		} else {
			return "Classificação: Obesidade grau II";
		}

	}
}
