package projetoCalculadora;

public class Calculadora implements CalculadoraBasica {
	
	 public float somar(float op1, float op2) { 
		 return op1 + op2;
	 }
	 
	 public float subtrair(float op1, float op2) {
		 return op1 - op2;
	 }
	 
	 public float dividir(float op1, float op2) {
		 if (op2 != 0) {
			 return op1 / op2;
		 } 
		 else {
			 return 0;
		 }
	 }
	 
	 public float multiplicar(float op1, float op2) {
		 return op1 * op2;
	 }

}
