package br.com.mirante.orcamentosis.repositorio;

import java.util.List;

import br.com.mirante.or�amentosis.model.Orcamento;

public interface OrcamentoRepository {
	int obterMaiorId();
	void salvar(Orcamento orcamento);
	List<Orcamento> listar();
}
