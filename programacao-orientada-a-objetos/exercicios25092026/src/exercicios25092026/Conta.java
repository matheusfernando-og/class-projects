package exercicios25092026;

public class Conta {
	Conta(String titular, double saldo){
		this.titular = titular;
		this.saldo = saldo;
	}
	protected String titular;
	protected double saldo;
	
	boolean depositar(double deposito) {
		if (deposito <= 0.0) {
			System.out.println("O valor deve ser maior que 0");
			return false;
		}
		if (!validarDeposito(deposito)) return false; 
		saldo += deposito;
		System.out.println("Depositado R$" + deposito + " na conta de " + titular + "!");
		return true;
	}
	
	// Permite alterar o comportamento de verificação para outros tipos de conta sem ter que reescrevê-los
	protected boolean validarDeposito(double deposito) {
		return true;
	}
	
	boolean sacar(double saque) {
		double saldoTemp = saldo;
		if ((saldoTemp -= saque) < 0.0) {
			System.out.println("Saldo insuficiente");
			return false;
		}
		saldo -= saque;
		System.out.println("Saque de R$" + saque + " realizado da conta de " + titular + "!");
		return true;
	}
	
	void exibirSaldo() {
		System.out.println("== Conta de " + titular + " ==");
		System.out.println("Saldo disponível: " + saldo);
		System.out.println("");
	}
}
