package exercicios13112026;

public class EquipamentoIluminacao extends Equipamento {

	EquipamentoIluminacao(int codigo, String nome, double diaria) {
		super(codigo, nome, diaria);
	}

	@Override
	public double calcularValor(int dias) {
		return (getDiaria() * dias) + 50.0;
	}
}
