package exercicios13112026;

public abstract class Equipamento {
	Equipamento(int codigo, String nome, double diaria){
		this.codigo = codigo;
		this.nome = nome;
		this.diaria = diaria;
		this.disponivel = true;
	}
	private int codigo;
	private String nome;
	private double diaria;
	private boolean disponivel;
	
	public abstract double calcularValor(int dias);
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getDiaria() {
		return diaria;
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}
	
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
