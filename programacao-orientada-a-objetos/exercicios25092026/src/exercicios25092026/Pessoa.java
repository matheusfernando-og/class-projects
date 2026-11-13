package exercicios25092026;

public class Pessoa {
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	String nome;
	int idade;
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
}
