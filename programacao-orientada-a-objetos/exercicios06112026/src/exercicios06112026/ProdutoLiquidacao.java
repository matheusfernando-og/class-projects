package exercicios06112026;

public class ProdutoLiquidacao implements Descontavel {
	ProdutoLiquidacao(double preco){
		this.preco = preco;
	}
	private double preco;
	public double calcularPrecoFinal() {
		return preco -= (preco * 0.10);
	}
}
