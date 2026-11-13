package exercicios25092026;

public class Aluno extends Pessoa {
	Aluno(String nome, int idade, String curso){
		super(nome, idade);
		this.curso = curso;
	}
	String curso;
}
