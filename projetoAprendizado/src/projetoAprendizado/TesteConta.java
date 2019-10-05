package projetoAprendizado;

public class TesteConta {

	public static void main(String[] args) {

		/*----------------- Conta -----------------*/
		Conta ct = new Conta();
		ct.setNomeTitular("João");
		ct.setNumeroConta(1234);
		ct.deposita(1000.0);
		ct.saque(500.0);
		System.out.println("Numero da Conta : " + ct.getNumeroConta());
		System.out.println("Tipo da Conta   : " + ct.getTipo());
		System.out.println("Nome do Titular : " + ct.getNomeTitular());
		System.out.println("Saldo atual é   : " + ct.getSaldo());

		
		/*----------------- Conta Poupança ---------*/
		System.out.println(" ");
		ContaPoupança cp = new ContaPoupança(); 
		cp.setNomeTitular("Pedro");
		cp.setNumeroConta(5678);
		cp.deposita(1000);
		cp.saque(300); 
		System.out.println("Numero da Conta : " + cp.getNumeroConta()); 
		System.out.println("Tipo da Conta   : " + cp.getTipo()); 
		System.out.println("Nome do Titular : " + cp.getNomeTitular()); 
		System.out.println("Saldo atual é   : " + cp.getSaldo());
		 

		/*----------------- Conta Corrente---------*/
		System.out.println(" ");
		ContaCorrente cc = new ContaCorrente();
		cc.setNomeTitular("Jaime");
		cc.setNumeroConta(8901);
		cc.deposita(3000);
		cc.saque(600);
		System.out.println("Numero da Conta : " + cc.getNumeroConta());
		System.out.println("Tipo da Conta   : " + cc.getTipo());
		System.out.println("Nome do Titular : " + cc.getNomeTitular());
		System.out.println("Saldo atual é   : " + cc.getSaldo());
		
		/*----------------- Conta Especial --------*/
		System.out.println(" ");
		ContaEspecial ce = new ContaEspecial();
		ce.setNomeTitular("Fulano");
		ce.setNumeroConta(2424);
		ce.deposita(10000);
		ce.saque(1000);
		System.out.println("Numero da Conta : " + ce.getNumeroConta());
		System.out.println("Tipo da Conta   : " + ce.getTipo());
		System.out.println("Nome do Titular : " + ce.getNomeTitular());
		System.out.println("Saldo atual é   : " + ce.getSaldo());

	}

}
