package exercicios25092026;

public class Gerente extends Funcionario {
	Gerente(String nome, double salario){
		super(nome, salario);
	}
	
	public void exibirDados() {
		System.out.println(nome);
	    System.out.println(getSalario());
	}
}
