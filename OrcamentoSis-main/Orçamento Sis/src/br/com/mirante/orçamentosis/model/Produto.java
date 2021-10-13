package br.com.mirante.orçamentosis.model;

public class Produto {
	String origem;
	int codigo;
	String nome;
	float precoUnit;
	String medida;
	int unitComprada;
	float precoFinal = unitComprada * precoUnit;
	
	
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPrecoUnit() {
		return precoUnit;
	}
	public void setPrecoUnit(float precoUnit) {
		this.precoUnit = precoUnit;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public int getUnitComprada() {
		return unitComprada;
	}
	public void setUnitComprada(int unitComprada) {
		this.unitComprada = unitComprada;
	}
	public float getPrecoFinal() {
		return precoFinal;
	}
	public void setPrecoFinal(float precoFinal) {
		this.precoFinal = precoFinal;
	}
	
	
	public Produto(String origem, int codigo, String nome, float precoUnit, String medida, int unitComprada) {
		super();
		this.origem = origem;
		this.codigo = codigo;
		this.nome = nome;
		this.precoUnit = precoUnit;
		this.medida = medida;
		this.unitComprada = unitComprada;
	}
	
	public void mostrarProduto(Produto produto) {
		System.out.println("================");
		System.out.println("Produto: "+ produto.getNome());
		System.out.println("Código: "+ produto.getCodigo());
		System.out.println("Preço da unidade: "+ produto.getPrecoUnit());
		System.out.println("================");
	}
	private void Relatorio() {
		System.out.println("Total comprado igual a:" + precoFinal);
	}
	
}

