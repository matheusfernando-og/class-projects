package exercicios13112026;

public class EquipamentoProjecao extends Equipamento {

	EquipamentoProjecao(int codigo, String nome, double diaria) {
		super(codigo, nome, diaria);
	}

	@Override
	public double calcularValor(int dias) {
		double valorFinal = getDiaria() * dias;
		if (dias >= 3) return valorFinal * 0.9;
		return valorFinal;
	}
}
