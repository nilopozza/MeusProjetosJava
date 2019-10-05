package projetoCalculadora;

import javax.swing.JOptionPane;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		/* Exibe menu para o usu�rio */
		System.out.println("*---------------------------------------*");
		System.out.println("*        Calculadora Vers�o 1.0         *");
		System.out.println("*---------------------------------------*");
		System.out.println("*    Menu de Fun��es Dispon�veis        *");
		System.out.println("*---------------------------------------*");
		System.out.println("* - 1: Soma             de dois n�meros *");
		System.out.println("* - 2: Subtra��o        de dois n�meros *");
		System.out.println("* - 3: Divis�o       entre dois n�meros *");
		System.out.println("* - 4: Multiplica��o entre dois n�meros *");
		System.out.println("*---------------------------------------*");
		
		/* Solicita que o usuario digite a op��o          */
		String opcao = JOptionPane.showInputDialog("Informe a fun��o desejada: ", "digite o valor aqui");
		
		/* Solicita que o usuario digite o primeiro valor */
		float numero1 = Float.parseFloat((JOptionPane.showInputDialog("Informe o primeiro n�mero: ", "digite o valor aqui")));

		/* Solicita que o usuario digite o segundo valor */
		float numero2 = Float.parseFloat((JOptionPane.showInputDialog("Informe o segundo  n�mero: ", "digite o valor aqui")));
		
		/* Cria calculadora                              */
	    Calculadora calc = new Calculadora();
	    
	    /* Direciona                                */
		switch (opcao) {
		
		case "1":
			System.out.println("Soma entre: " + numero1 + " e " + numero2 + " �: " + calc.somar(numero1, numero2));
			break;
			
		case "2":
			System.out.println("Subtra��o entre: " + numero1 + " e " + numero2 + " �: " + calc.subtrair(numero1, numero2));
			break;
			
		case "3":
			System.out.println("Divis�o inteira entre: " + numero1 + " e " + numero2 + " �: " + calc.dividir(numero1, numero2));
			break;
			
		case "4":
			System.out.println("Multiplica��o entre: " + numero1 + " e " + numero2 + " �: " + calc.multiplicar(numero1, numero2));
			break;
			
		default:
			System.out.println("Op��o n�o dispon�vel: " + opcao);
			break;
		}
		
	}
}
