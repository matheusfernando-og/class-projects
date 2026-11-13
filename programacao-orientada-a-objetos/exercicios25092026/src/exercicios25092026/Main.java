package exercicios25092026;

public class Main {

	static void linebreak() { System.out.println(""); }
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João", 20, "Engenharia de Software");
		aluno1.exibirDados();
		
		linebreak();
		
		Cachorro cachorro1 = new Cachorro("Pingo");
		cachorro1.comer();
		cachorro1.latir();
		
		linebreak();
		
		Carro carro1 = new Carro("Toyota", "Corolla", 4);
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.frear();
		carro1.exibirDados();
		
		linebreak();
		
		Livro livro1 = new Livro("Memórias Póstumas de Brás Cubas", 30.00, "Machado de Assis", 120);
		livro1.exibirInfo();
		
		linebreak();
		
		Carro carro2 = new Carro("Ford", "Focus", 4);
		Moto moto1 = new Moto("Honda", "Titan", 150);
		
		carro2.acelerar();
		moto1.acelerar();
		
		carro2.frear();
		moto1.frear();
		
		carro2.exibirDados();
		
		linebreak();
		
		moto1.exibirDados();
		
		linebreak();
		
		carro2.acelerar();
		moto1.acelerar();
		
		carro2.exibirDados();
		
		linebreak();
		
		moto1.exibirDados();
		
		linebreak();
		
		ContaCorrente conta1 = new ContaCorrente("Matheus", 500.00, 1000.00);
		ContaPoupanca conta2 = new ContaPoupanca("João", 3000.00);
		
		conta1.exibirSaldo();
		
		conta1.depositar(499.00);
		conta1.depositar(3000.00);
		
		linebreak();
		
		conta1.exibirSaldo();
		
		linebreak();
		
		conta2.exibirSaldo();
		
		conta2.render(0.0);
		
		linebreak();
		
		conta2.exibirSaldo();
		
		conta2.sacar(1500.00);
		
		linebreak();
		
		conta2.exibirSaldo();
		
		
	}
	
	
}
