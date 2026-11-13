package exercicios25092026;

public class ContaCorrente extends Conta {
	ContaCorrente(String titular, double saldo, double limite) {
		super(titular, saldo);
		this.limite = limite;
	}
	protected double limite;
	
	@Override 
	protected boolean validarDeposito(double deposito) {
		if ((saldo + deposito) > limite) {
			System.out.println("O valor ultrapassa o limite da conta");
			return false;
		}
		return true;
	}
}
