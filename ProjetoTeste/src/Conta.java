
public class Conta {

	private int numeroConta;
	protected String nomeTitular;
	protected double saldo;

	/* Definição de construtor */
    Conta(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	/* Métodos para obter valor dos atributos */
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public String getNomeTitular() {
		return this.nomeTitular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	/* Métodos para modificar valor dos atributos */
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public boolean Saque(double valor) {
		if (valor <= 0) {
			return false;
		}
		
		if (valor > this.saldo) {
			return false;
		}
		
		this.saldo -= valor;
		return true;
			
	}
	
	public void Deposito(double valor) {
		this.saldo += valor;
	}
	
	
	
	
}
