package exercicios13112026;

public class EquipamentoSom extends Equipamento {

	EquipamentoSom(int codigo, String nome, double diaria) {
		super(codigo, nome, diaria);
	}

	@Override
	public double calcularValor(int dias) {
		return getDiaria() * dias;
	}
}
