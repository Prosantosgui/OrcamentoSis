package br.com.mirante.or�amentosis.servico;

import java.util.List;

import br.com.mirante.orcamentosis.repositorio.OrcamentoRepository;
import br.com.mirante.orcamentosis.repositorio.OrcamentoRepositoryEmJava;
import br.com.mirante.or�amentosis.model.Orcamento;

public class ListarOrcamentoServico {
	
	private OrcamentoRepository repositorio = new OrcamentoRepositoryEmJava();
	
	public List<Orcamento> listarOrcamento(){
		return repositorio.listar();
	}
}
