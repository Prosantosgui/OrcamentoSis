package br.com.mirante.orçamentosis.view;

import br.com.mirante.orçamentosis.model.Orcamento;
import br.com.mirante.orçamentosis.servico.ListarOrcamentoServico;

public class ListarOrcamentosUI {
	private ListarOrcamentoServico servico = new ListarOrcamentoServico();
	
	public void exibir() {
		var orcamentos = servico.listarOrcamento();
		for(Orcamento orcamento : orcamentos) {
			
			System.out.print(orcamento.getDescricao());
			System.out.print("       |");
			System.out.print(orcamento.getPeriodo());
			System.out.print("       |");
			System.out.print(orcamento.getValorTotal());
			System.out.println();
			
		}
		new MenuPrincipal().ExibirInterface();;
	}

}
