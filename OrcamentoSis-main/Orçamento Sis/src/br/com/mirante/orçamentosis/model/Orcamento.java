package br.com.mirante.orçamentosis.model;

public class Orcamento {
	
	String Descricao;
	int Periodo;
	float Valor;
	
	
	public String getDescricao() {
		return Descricao;
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
	public float getValor() {
		return Valor;
	}
	public void setValor(float valor) {
		Valor = valor;
	}
	
	public Orcamento(String descricao, int periodo, float valor) {
		super();
		Descricao = descricao;
		Periodo = periodo;
		Valor = valor;
	}
	
}
