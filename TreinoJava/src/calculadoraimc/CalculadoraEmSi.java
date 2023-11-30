package calculadoraimc;




import calculadoraimc.DadosCalculos;


@SuppressWarnings("unused")
public class CalculadoraEmSi {

	public static void main(String[] args) {
		
		
		
		DadosCalculos pessoa1 = new DadosCalculos();
		pessoa1.setpeso(90);
		pessoa1.setaltura(1.7);
		double novoIMC = pessoa1.getIMC();
		String classificacao = DadosCalculos.avaliarCategoriaIMC(novoIMC);
        System.out.println(classificacao);
		
		
		
	}

}
