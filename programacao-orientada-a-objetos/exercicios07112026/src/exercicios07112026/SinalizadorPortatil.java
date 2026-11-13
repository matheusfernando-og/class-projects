package exercicios07112026;

public class SinalizadorPortatil implements Rastreavel {
	
	SinalizadorPortatil(String localAtual){
		this.localAtual = localAtual;
	}
	
	String localAtual;
	
	@Override
	public String informarLocalizacao() {
		return localAtual;
	}

}
