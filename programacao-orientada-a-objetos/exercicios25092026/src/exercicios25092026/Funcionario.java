package exercicios25092026;

public class Funcionario {
	Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	protected String nome;
	private double salario;
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		if (salario >= 0.0) this.salario = salario;
	}
}
