package exercicios07112026;

public class DroneResgate extends UnidadeResgate implements Rastreavel {

	DroneResgate(String identificador, String localAtual) {
		super(identificador);
		this.localAtual = localAtual; 
	}
	
	String localAtual;

	@Override
	public void atenderChamado(String local) {
		localAtual = local;
		System.out.println("A unidade " + getIdentificador() + " foi enviada para " + local + " e iniciou uma busca aérea!");
	}

	@Override
	public String informarLocalizacao() {
		return localAtual;
	}
}
