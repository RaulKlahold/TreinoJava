package calculadoraimc;

public class DadosCalculos {
	private double altura;
	private double peso;
	private double IMC;
	private String categoria;

	public double getaltura() {
		return altura;
	}

	public void setaltura(double Novoaltura) {
		this.altura = Novoaltura;
	}

	public double getpeso() {
		return peso;
	}

	public void setpeso(double Novopeso) {
		this.peso = Novopeso;
	}

	public double getIMC() {
		return IMC;
	}

	public void setIMC(double NovoIMC) {
		this.IMC = NovoIMC;
	}

	public String getcategoria() {
		return categoria;
	}

	public void setcategoria(String Novocategoria) {
		this.categoria = Novocategoria;
	}

	public void CalculaImc(double Novopeso, double Novoaltura) {
		this.IMC = Novopeso / (Novoaltura * Novoaltura);
	}

	public static String avaliarCategoriaIMC(double NovoIMC) {
		if (NovoIMC < 18.5) {
			return "Classificação: Magreza";
		} else if (NovoIMC < 25) {
			return "Classificação: Peso normal";
		} else if (NovoIMC < 30) {
			return "Classificação: Sobrepeso";
		} else if (NovoIMC < 35) {
			return "Classificação: Obesidade grau I";
		} else if (NovoIMC < 40) {
			return "Classificação: Obesidade grau II";
		} else {
			return "Classificação: Obesidade grau II";
		}

	}
}
