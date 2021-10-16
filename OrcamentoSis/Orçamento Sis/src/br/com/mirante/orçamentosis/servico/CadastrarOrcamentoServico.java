package br.com.mirante.orçamentosis.servico;

import br.com.mirante.orcamentosis.repositorio.OrcamentoRepository;
import br.com.mirante.orcamentosis.repositorio.OrcamentoRepositoryEmJava;
import br.com.mirante.orçamentosis.model.Orcamento;

public class CadastrarOrcamentoServico {
 
	private OrcamentoRepository repositorio = new OrcamentoRepositoryEmJava();
	
	public void cadastrar(Orcamento orcamento) {
		int maiorId = repositorio.obterMaiorId();
		orcamento.setId(maiorId + 1);
		repositorio.salvar(orcamento);
	}

}
