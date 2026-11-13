package exercicios06112026;

public class Main {

	public static void main(String[] args) {
		Guerreiro guerreiro = new Guerreiro("Julius", 75);
		Mago mago = new Mago("Emilia", 80);
		Personagem[] personagens = {guerreiro,mago};
		
		for (int i = 0; i < personagens.length; i++) {
			personagens[i].atacar();
		}
		
		System.out.println("Energia do mago: " + mago.getEnergia());
		
		mago.curar(10);
		
		System.out.println("Energia do mago: " + mago.getEnergia());
		
		mago.curar(20);
		
		System.out.println("Energia do mago: " + mago.getEnergia());
		
		mago.curar(-10);
		
	}

}
