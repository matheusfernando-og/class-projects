package exercicios25092026;

public class Cachorro extends Animal {
	Cachorro(String nome){
		super(nome);
	}
	
	void latir() {
		System.out.println("O cachorro "  + nome + " está latindo!");
	}
}
