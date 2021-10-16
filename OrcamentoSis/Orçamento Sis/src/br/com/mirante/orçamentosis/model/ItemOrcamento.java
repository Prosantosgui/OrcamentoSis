package br.com.mirante.orçamentosis.model;


public class ItemOrcamento {
	private String origem;
	private String codigo;
	private String descricaoItem;
	private float valorUnitario;
	private String unidadeMedida;
	private float quantidade;
	private float valorTotalInformado;

	public ItemOrcamento(String origem, String codigo, String descricaoItem, float valorUnitario, String unidadeMedida,
			float quantidade, float valorTotalInformado) {

		super();
		this.origem = origem;
		this.codigo = codigo;
		this.descricaoItem = descricaoItem;
		this.valorUnitario = valorUnitario;
		this.unidadeMedida = unidadeMedida;
		this.quantidade = quantidade;
		this.valorTotalInformado = valorTotalInformado;
	}

	public boolean possuiInconsistencia() {
		return valorUnitario * quantidade != valorTotalInformado;
	}

}