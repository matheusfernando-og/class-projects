package exercicios06112026;

public class ProdutoComum implements Descontavel {
	ProdutoComum(double preco){
		this.preco = preco;
	}
	private double preco;
	public double calcularPrecoFinal() {
		return preco -= (preco * 0.05);
	}
}
