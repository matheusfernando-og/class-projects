package exercicios06112026;

public class ProdutoPromocional implements Descontavel {
	ProdutoPromocional(double preco){
		this.preco = preco;
	}
	private double preco;
	public double calcularPrecoFinal() {
		return preco -= (preco * 0.20);
	}
}
