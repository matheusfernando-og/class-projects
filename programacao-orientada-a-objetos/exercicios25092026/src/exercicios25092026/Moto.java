package exercicios25092026;

public class Moto extends Veiculo {
	Moto(String marca, String modelo, int cc) {
		super(marca, modelo);
		this.cc = cc;
	}
	int cc;
	
	@Override void acelerar(){
		velocidade += 30;
	}
}
