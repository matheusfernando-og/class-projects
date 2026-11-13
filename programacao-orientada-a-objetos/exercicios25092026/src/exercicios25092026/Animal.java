package exercicios25092026;

public class Animal {
	Animal(String nome){
		this.nome = nome;
	}
	protected String nome;
	
	void comer(){
		System.out.println("O animal " + nome + " está comendo!");
	}
}
