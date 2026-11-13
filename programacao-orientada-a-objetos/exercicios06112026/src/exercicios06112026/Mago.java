package exercicios06112026;

public class Mago extends Personagem implements Curavel {
	Mago(String nome, int energia) {
		super(nome, energia);
	}
	public void atacar() {
		System.out.println("Mago atacou com sua magia!");
	}
	public void curar(int quantidade) {
		modificarEnergia(quantidade);
	}
}
