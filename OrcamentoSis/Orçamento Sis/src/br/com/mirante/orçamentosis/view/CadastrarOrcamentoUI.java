package br.com.mirante.or�amentosis.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.mirante.or�amentosis.model.ItemOrcamento;
import br.com.mirante.or�amentosis.model.Orcamento;
import br.com.mirante.or�amentosis.servico.CadastrarOrcamentoServico;

public class CadastrarOrcamentoUI {

	private CadastrarOrcamentoServico servico = new CadastrarOrcamentoServico();
		
	public void cadastroOrcamento() {
		System.out.println("=============");
		System.out.println("Insira a descri��o: ");
		var scanner = new Scanner(System.in);
		var desc = scanner.nextLine();
		System.out.println("Insira o per�odo(m�s) do or�amento: ");
		var per = scanner.nextInt();
		System.out.println("Insira o ano:");
		var ano = scanner.nextInt();
		System.out.println("Insira o valor total do or�amento: ");
		var total = scanner.nextFloat();	
		
		System.out.println("Informe um item de or�amento:");
		String item = scanner.nextLine();
		
		List<String> itens = new ArrayList<>();
		itens.add(item);
		
		System.out.println("Deseja incluir um novo item? [S] / [N]");
		String novoItem = scanner.nextLine();
		while(novoItem.equals("S")) {
			System.out.println("Informe um item de or�amento:");
			item = scanner.nextLine();
			itens.add(item);
			System.out.println("Deseja incluir um novo item? [S] / [N]");
			novoItem = scanner.nextLine();
		}
		
		List<ItemOrcamento> itensOrcamento = new ArrayList<ItemOrcamento>();
		for(String i: itens) {
			itensOrcamento.add(converter(i));
		}
		var orcamento = new Orcamento(desc,per,ano,total,itensOrcamento);
		// Construtor suspeito a futuro erro, est� difente de orcamento.java 
		//Orcamento orcamento = new Orcamento(desc, per, total, per, total, new ArrayList<ItemOrcamento>()
        //);
		System.out.println("=============");
		System.out.println("Descri��o: "+ orcamento.getDescricao());
		System.out.println("Per�odo: " + orcamento.getPeriodo());
		System.out.println("Valor: " + orcamento.getValorTotal());
		System.out.println("=============");
		
		servico.cadastrar(orcamento);
		new MenuPrincipal().ExibirInterface();
	}
	private ItemOrcamento converter(String item) {
		String[] atributos = item.split(";");
		String origem = atributos[0];
		String codigo = atributos[1];
		String descricao = atributos[2];
		float valorUnitario = Float.parseFloat(atributos[3]);
		String unidade = atributos[4];
		float quantidade = Float.parseFloat(atributos[5]);
		float valorTotalInformado = Float.parseFloat(atributos[6]);
		//
		return new ItemOrcamento(
			origem, codigo, descricao, valorUnitario, unidade, quantidade, valorTotalInformado
		);
}


	
};