package br.com.mirante.orçamentosis.model;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	
	private String Descricao;
	private int Periodo;
	private int id;
	private int ano;
	private float valorTotal;
	private List<ItemOrcamento> itensOrcamento;
	
	public String getDescricao() {
		return Descricao;
	}
	
	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<ItemOrcamento> getItensOrcamento() {
		return itensOrcamento;
	}

	public void setItensOrcamento(List<ItemOrcamento> itensOrcamento) {
		this.itensOrcamento = itensOrcamento;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public int getPeriodo() {
		return Periodo;
	}
	public void setPeriodo(int periodo) {
		Periodo = periodo;
	}
	public int getAno() {
		return ano;
	}


	public List<ItemOrcamento> detalharInconsistencia() {
		var itensComInconsistencia = new ArrayList<ItemOrcamento>();
		for (var itemOrcamento: itensOrcamento){
			if(itemOrcamento.possuiInconsistencia()) {
				itensComInconsistencia.add(itemOrcamento);
			}
		}
		
		return itensComInconsistencia;
	}
	public Orcamento(String descricao, int periodo,int ano, float valorTotal,
			List<ItemOrcamento> itensOrcamento) {
		super();
		this.Descricao = descricao;
		this.Periodo = periodo;
		this.ano = ano;
		this.valorTotal = valorTotal;
		this.itensOrcamento = itensOrcamento;
	}
	/*
	public int getId() {
		return id;
	}
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}
	*/

	public int getId() {

		return id;
	}

	public void setId(int id) {
		this.id = id;
		// TODO Auto-generated method stub
		
	}
}
