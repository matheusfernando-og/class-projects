package exercicios13112026;

public class Main {

	public static void main(String[] args) {
		// Para adicionar uma nova categoria de equipamento com regras próprias de preço,
		// basta criar uma nova classe com extends Equipamento, incluir ela aqui e
		// adicioná-la no inventário
		
		// Utiliza-se polimorfismo para poder incluir todos os equipamentos em um array
		Equipamento som = new EquipamentoSom(1, "Caixa de som", 100.00);
        Equipamento iluminacao = new EquipamentoIluminacao(2, "Kit de iluminação", 80.00);
        Equipamento projecao = new EquipamentoProjecao(3, "Projetor", 150.00);
        
        // Adicionar equipamentos novos no inventário para checar se o equipamento existe
        Equipamento[] inventario = { som, iluminacao, projecao };
        SistemaLocacao sistema = new SistemaLocacao(inventario);
        
        sistema.listarDisponiveis();
        
        try {
            Equipamento[] solicitados = { som, iluminacao, projecao };
            Locacao locacao = sistema.criarLocacao("Ana", solicitados, 3);

            locacao.exibirResumo();
            sistema.listarDisponiveis();
            sistema.registrarDevolucao(locacao);

            Equipamento[] solicitados2 = { som, iluminacao };
            Locacao locacao2 = sistema.criarLocacao("Bruno", solicitados2, 1);
            
            locacao2.exibirResumo();
            sistema.listarDisponiveis();
            
            // Erro propostial, tentando devolver uma locação já devolvida
            sistema.registrarDevolucao(locacao);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Operação recusada: " + e.getMessage());
        }
        
	}
}
