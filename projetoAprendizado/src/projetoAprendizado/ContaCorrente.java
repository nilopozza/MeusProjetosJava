package projetoAprendizado;

public class ContaCorrente extends Conta {

	public boolean saque(double valor) {
		return super.saque(valor + 0.1);
	}
	
	public String getTipo() {
		return "Conta Corrente";
	}
	
}
