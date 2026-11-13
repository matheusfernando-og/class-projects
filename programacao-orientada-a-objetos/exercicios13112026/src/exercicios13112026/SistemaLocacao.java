package exercicios13112026;

public class SistemaLocacao {
	SistemaLocacao(Equipamento[] equipamentos){
		this.equipamentos = equipamentos;
	}
	Equipamento[] equipamentos;
	
	public void listarDisponiveis() {
		for (int i = 0; i < equipamentos.length; i++ ) {
			String disponivelString = equipamentos[i].isDisponivel() ? "está disponível!" : "não está disponível.";
			System.out.println(equipamentos[i].getNome() + " (código " + equipamentos[i].getCodigo() + ") " + disponivelString);
		}
		System.out.println("");
	}
	
	public Locacao criarLocacao(String nome, Equipamento[] solicitados, int dias) {
	    if (dias <= 0) {
	        throw new IllegalArgumentException("Os dias devem ser maiores que zero.");
	    }

	    if (solicitados.length == 0) {
	        throw new IllegalArgumentException("A locação deve incluir pelo menos um equipamento.");
	    }

	    for (int i = 0; i < solicitados.length; i++) {
	        boolean pertenceAoSistema = false;

	        for (int j = 0; j < this.equipamentos.length; j++) {
	            if (solicitados[i] == this.equipamentos[j]) {
	                pertenceAoSistema = true;
	                break;
	            }
	        }

	        if (!pertenceAoSistema) {
	            throw new IllegalArgumentException("Um equipamento solicitado não pertence ao sistema.");
	        }

	        if (!solicitados[i].isDisponivel()) {
	            throw new IllegalStateException("Um ou mais equipamentos não estão disponíveis.");
	        }
	    }

	    for (int i = 0; i < solicitados.length; i++) {
	        solicitados[i].setDisponivel(false);
	    }

	    return new Locacao(nome, solicitados, dias);
	}
	
	public void registrarDevolucao(Locacao locacao) {
		if (!locacao.isAtivada()) {
            throw new IllegalStateException("Esta locação já foi devolvida.");
        }
		
		Equipamento[] equipamentosLocacao = locacao.getEquipamentos();
		for (int i = 0; i < equipamentosLocacao.length; i++) {
			equipamentosLocacao[i].setDisponivel(true);
		}
		
		locacao.encerrar();
	}
}
