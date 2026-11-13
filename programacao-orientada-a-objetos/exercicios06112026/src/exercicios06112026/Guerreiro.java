package exercicios06112026;

public class Guerreiro extends Personagem {
	Guerreiro(String nome, int energia) {
		super(nome, energia);
	}
	public void atacar() {
		System.out.println("Guerreiro atacou com sua espada!");
	}
}
