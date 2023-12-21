package calculadoraimc;




import java.util.Scanner;

import calculadoraimc.DadosCalculos;


@SuppressWarnings("unused")
public class CalculadoraEmSi {

	public static void main(String[] args) {
		
		
        try {
        	
        	DadosCalculos pessoa1 = new DadosCalculos();
    		Scanner scanner = new Scanner(System.in);
    		
    		// (pessoa1) foi o novo obejto de dados instanciado, no qual irá mandar o valor scaaniado para 
    		//a classe DadosCalculos, onde lá ira trabalhar os valores e retornar o imc.
    		
    		System.out.print("Digite o peso em kg: ");
            double peso = scanner.nextDouble();
    		pessoa1.setpeso(peso);
    		 
    		// mas para usar o scanner foi preciso criar uma variavel para armazenar o valor.
    		// onde o mesmo sera utilizado como parâmetro para setar o peso que será utilizado no calculo.
    		
    		System.out.print("Digite a altura em metros: ");
            double altura = scanner.nextDouble();
    		pessoa1.setaltura(altura);
    		 scanner.close();
    		// o mesmo se repete embaixo para altura!!
    		 //scanner.close(); importante usar isso para fechar o scanner, isso é muito bom!
    		 
    		double novoIMC = pessoa1.getIMC();
    		String classificacao = DadosCalculos.avaliarCategoriaIMC(novoIMC);
            System.out.println(classificacao);
            
        } catch (ArithmeticException e) {
            System.out.println("Erro ao realizar cálculo: divisão por zero.");
        } catch (NumberFormatException e) {
            System.out.println("Por favor, insira um número válido.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }

	}

}
