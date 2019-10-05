package projetoAprendizado;

public class Conta {

	private int    numeroConta;
	private String nomeTitular;
	private double saldo;
	private double taxa = 1;
	
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
	
	public boolean saque(double valor) {
		if (valor <= 0) {
			return false;
		}
		
		if (valor > this.saldo) {
			return false;
		}
		
		this.saldo -= valor;
		return true;		
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public String getTipo() {
		return "Conta Padrão";
	}
	
	public double getTaxaBancaria() {
		return this.taxa;
	}

	public double getTaxabancaria(int dias) {
		if (dias <= 0) {
			return getTaxaBancaria();
		}
		return getTaxaBancaria() * dias;
	}
}
