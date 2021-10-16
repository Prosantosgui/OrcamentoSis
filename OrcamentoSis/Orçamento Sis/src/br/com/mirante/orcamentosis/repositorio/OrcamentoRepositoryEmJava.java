package br.com.mirante.orcamentosis.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.com.mirante.orçamentosis.model.Orcamento;

public class OrcamentoRepositoryEmJava implements OrcamentoRepository{
	
	static List<Orcamento> orcamentos = new ArrayList<Orcamento>();
	
	@Override
	public int obterMaiorId() {
		if(orcamentos.isEmpty()) {
			return 0;
		}
		var ultimoOrcamento = orcamentos.get(orcamentos.size() - 1);
		return ultimoOrcamento.getId();
	}
	
	@Override
	public void salvar(Orcamento orcamento) {
		orcamentos.add(orcamento);
	}

	@Override
	public List<Orcamento> listar() {
		// TODO Auto-generated method stub
		return orcamentos;
	}
}
