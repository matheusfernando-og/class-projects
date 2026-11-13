package exercicios25092026;

public class Livro extends Produto {
	Livro(String nome, double preco, String autor, int numPags) {
		super(nome, preco);
		this.autor = autor;
		this.numPags = numPags;
	}
	
	String autor;
	int numPags;
	
	void exibirInfo() {
		System.out.println("== Informações do livro ==");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Autor: " + autor);
		System.out.println("Número de páginas: " + numPags);
	}
}
