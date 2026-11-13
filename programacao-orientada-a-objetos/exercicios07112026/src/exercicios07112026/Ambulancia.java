package exercicios07112026;

public class Ambulancia extends UnidadeResgate {
	Ambulancia(String identificador) {
		super(identificador);
	}

	@Override
	public void atenderChamado(String local) {
		System.out.println("A unidade " + getIdentificador() + " foi enviada para " + local + " para prestar atendimento médico!");
	}
}
