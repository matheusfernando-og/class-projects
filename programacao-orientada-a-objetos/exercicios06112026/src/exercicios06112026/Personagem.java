package exercicios06112026;

public abstract class Personagem {
	Personagem(String nome, int energia){
		this.nome = nome;
		setEnergia(energia);
	}
	private String nome;
	private int energia;
	
	public String getNome() {
		return nome;
	}
	
	public boolean setNome(String nome) {
		this.nome = nome;
		return true;
	}
	
	public int getEnergia() {
		return energia;
	}
	
	public boolean setEnergia(int energia) {
		if (energia < 0) {
			this.energia = 0;
			return true;
		}
		if (energia > 100) {
			this.energia = 100;
			return true;
		}
		this.energia = energia;
		return true;
	}
	
	public boolean modificarEnergia(int energiaModificador) {
		if ((energiaModificador <= 0)) {
			throw new IllegalArgumentException("O modificador não pode ser menor ou igual a zero");
		}
		setEnergia(energia + energiaModificador);
		return true;
	}
	
	public abstract void atacar();
}
