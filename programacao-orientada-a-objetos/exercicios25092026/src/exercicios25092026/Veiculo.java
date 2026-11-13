package exercicios25092026;

public class Veiculo {
	Veiculo(String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = 0;
	}
	String marca, modelo;
	int velocidade;
	
	void acelerar() {
		velocidade += 5;
	}
	
	void frear() {
		int velocidadeTemp = velocidade;
		if ((velocidadeTemp -= 5) < 0) {
			velocidade = 0;
			return;
		}
		velocidade -= 5;
	}
	
	void exibirDados() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Velocidade atual: " + velocidade + " km/h");
	}
}
