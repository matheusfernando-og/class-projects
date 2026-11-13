package exercicios13112026;

public class Locacao {
	Locacao(String cliente, Equipamento[] equipamentos, int dias){
		this.cliente = cliente;
		this.equipamentos = equipamentos;
		diasContratados = dias;
	}
	private String cliente;
	private Equipamento[] equipamentos;
	private int diasContratados;
	private boolean ativada = true;
	
	public boolean isAtivada() {
		return ativada;
	}
	
	public Equipamento[] getEquipamentos() {
		return equipamentos;
	}
	
	public void encerrar() {
		ativada = false;
	}
	
	public void exibirResumo() {
	    double total = 0;

	    System.out.println("Cliente: " + cliente);
	    System.out.println("Dias contratados: " + diasContratados);

	    for (int i = 0; i < equipamentos.length; i++) {
	        double valorItem = equipamentos[i].calcularValor(diasContratados);

	        System.out.println(equipamentos[i].getNome() + ": R$ " + valorItem );
	        total += valorItem;
	    }
	    
	    System.out.println("Total: R$ " + total);
	    System.out.println("");
	}
	
}
