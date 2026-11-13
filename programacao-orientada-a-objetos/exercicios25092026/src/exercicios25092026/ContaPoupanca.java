package exercicios25092026;

public class ContaPoupanca extends Conta {
	ContaPoupanca(String titular, double saldo) {
		super(titular, saldo);
	}
	
	public void render(double taxaReferencial) {
		double taxaMensal = 0.005 + taxaReferencial;
		double rendimento = saldo * taxaMensal;
		
		System.out.println("Rendimento aplicado de R$" + rendimento + " na conta de " + titular);
		depositar(rendimento);
		
	}
	
}
