package projetoAprendizado;

public class ContaEspecial extends Conta {

	public boolean saque(double valor) {
		return super.saque(valor + (valor * 0.10));
	}
	
	public String getTipo() {
		return "Conta Especial";
	}

}
