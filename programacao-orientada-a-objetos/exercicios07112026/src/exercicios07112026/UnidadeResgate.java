package exercicios07112026;

public abstract class UnidadeResgate {
	UnidadeResgate(String identificador){
		this.identificador = identificador;
	}
	
	private String identificador;
	
	public String getIdentificador() {
		return identificador;
	}
	
	public abstract void atenderChamado(String local);
}
