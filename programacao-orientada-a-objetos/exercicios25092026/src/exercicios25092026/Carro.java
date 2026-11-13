package exercicios25092026;

public class Carro extends Veiculo {
	Carro(String marca, String modelo, int portas){
		super(marca, modelo);
		this.portas = portas;
	}
	int portas;
	
	@Override void acelerar(){
		velocidade += 20;
	}
}
