package projetoCalculadora;

import javax.swing.JOptionPane;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		/* Exibe menu para o usuário */
		System.out.println("*---------------------------------------*");
		System.out.println("*        Calculadora Versão 1.0         *");
		System.out.println("*---------------------------------------*");
		System.out.println("*    Menu de Funções Disponíveis        *");
		System.out.println("*---------------------------------------*");
		System.out.println("* - 1: Soma             de dois números *");
		System.out.println("* - 2: Subtração        de dois números *");
		System.out.println("* - 3: Divisão       entre dois números *");
		System.out.println("* - 4: Multiplicação entre dois números *");
		System.out.println("*---------------------------------------*");
		
		/* Solicita que o usuario digite a opção          */
		String opcao = JOptionPane.showInputDialog("Informe a função desejada: ", "digite o valor aqui");
		
		/* Solicita que o usuario digite o primeiro valor */
		float numero1 = Float.parseFloat((JOptionPane.showInputDialog("Informe o primeiro número: ", "digite o valor aqui")));

		/* Solicita que o usuario digite o segundo valor */
		float numero2 = Float.parseFloat((JOptionPane.showInputDialog("Informe o segundo  número: ", "digite o valor aqui")));
		
		/* Cria calculadora                              */
	    Calculadora calc = new Calculadora();
	    
	    /* Direciona                                */
		switch (opcao) {
		
		case "1":
			System.out.println("Soma entre: " + numero1 + " e " + numero2 + " é: " + calc.somar(numero1, numero2));
			break;
			
		case "2":
			System.out.println("Subtração entre: " + numero1 + " e " + numero2 + " é: " + calc.subtrair(numero1, numero2));
			break;
			
		case "3":
			System.out.println("Divisão inteira entre: " + numero1 + " e " + numero2 + " é: " + calc.dividir(numero1, numero2));
			break;
			
		case "4":
			System.out.println("Multiplicação entre: " + numero1 + " e " + numero2 + " é: " + calc.multiplicar(numero1, numero2));
			break;
			
		default:
			System.out.println("Opção não disponível: " + opcao);
			break;
		}
		
	}
}
