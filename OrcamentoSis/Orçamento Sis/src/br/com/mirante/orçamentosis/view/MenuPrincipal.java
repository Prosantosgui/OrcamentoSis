package br.com.mirante.or�amentosis.view;

import java.util.Scanner;

import br.com.mirante.or�amentosis.model.Orcamento;
import br.com.mirante.or�amentosis.model.Produto;
public class MenuPrincipal {
	Produto produto1 = new Produto("IBGE",1234,"ARROZ",10,"kg", 8);
	
	Scanner scanner = new Scanner(System.in);
	public void ImprimirMenu() {
		System.out.println("Digite o n�mero da op��o desejada:");
		System.out.println("[1]Cadastrar or�amento");
		System.out.println("[2]Listar or�amento");
		System.out.println("[3]Detalhar or�amento");
		System.out.println("[4]Sair");
	}
	public boolean VerificarOpcaoInvalida(String opcao){
		return !opcao.equals("1") &&
		 !opcao.equals("2") &&
		 !opcao.equals("3") &&
		 !opcao.equals("4");
		
	}
	public void ExibirInterface() {
		
		ImprimirMenu();

		var opcao = scanner.next();
		
		while(VerificarOpcaoInvalida(opcao)) {
			System.out.println("Op��o inv�lida, tente novamente!");
			ImprimirMenu();
			opcao = scanner.next();
		}
		processarOpcaoSelecionada(opcao); 
		
		
		
	}
	
	

	// Exibi��o de or�amentos existentes,la�o for futuramente com uso de banco de dados
	public void listarOrcamento(Orcamento orcamento){
		System.out.println("==========================");
		System.out.println("Descri��o: " + orcamento.getDescricao());
		System.out.println("Per�odo: " + orcamento.getPeriodo());
		System.out.println("Valor total: " + orcamento.getValorTotal());		
		System.out.println("==========================");
	}
	
	public void detalharOrcamento(Orcamento orcamento){
		System.out.println("==========================");
		System.out.println("Descri��o: " + orcamento.getDescricao());
		System.out.println("Per�odo: " + orcamento.getPeriodo());
		System.out.println("Valor total: " + orcamento.getValorTotal());		
		System.out.println("==========================");
	}
	/*
	Orcamento orcamento1 = new Orcamento("Novo orcamento", 5, 15);
	Orcamento orcamento2 = new Orcamento("Outro orcamento", 9, 58);
	Orcamento orcamento3 = new Orcamento("Orcamento 3", 7, 74);
	*/
	
	
	private void processarOpcaoSelecionada(String opcao) {
		if(opcao.equals("1")){
			System.out.println("Op��o 1 selecionada!");
			new CadastrarOrcamentoUI().cadastroOrcamento();;
		}
		else if(opcao.equals("2")){
			System.out.println("Op��o 2 selecionada!");
			new ListarOrcamentosUI().exibir();;
		} 
		else if(opcao.equals("3")){
			System.out.println("Op��o 3 selecionada!");

			
		} else if(opcao.equals("4")) {
			scanner.close();
			System.exit(0);
		}
	}
}
