package br.com.mirante.or�amentosis.view;

import java.util.Scanner;

import br.com.mirante.or�amentosis.model.Orcamento;
import br.com.mirante.or�amentosis.model.Produto;
public class InterfaceUsuario {
	Produto produto1 = new Produto("IBGE",1234,"ARROZ",10,"kg", 8);
	
	
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
		var scanner = new Scanner(System.in);
		var opcao = scanner.next();
		
		while(VerificarOpcaoInvalida(opcao)) {
			System.out.println("Op��o inv�lida, tente novamente!");
			ImprimirMenu();
			opcao = scanner.next();
		}
		processarOpcaoSelecionada(opcao); 
		
		
		
		scanner.close();
	}
	
	
	public void cadastroOrcamento() {
		System.out.println("=============");
		System.out.println("Insira a descri��o: ");
		var scanner = new Scanner(System.in);
		var desc = scanner.next();
		System.out.println("Insira o per�odo do or�amento: ");
		var per = scanner.nextInt();
		System.out.println("Insira o valor total do or�amento: ");
		var total = scanner.nextFloat();	
		Orcamento orcamento = new Orcamento(desc,per,total);
		scanner.close();
		System.out.println("=============");
		System.out.println("Descri��o: "+ orcamento.getDescricao());
		System.out.println("Per�odo: " + orcamento.getPeriodo());
		System.out.println("Valor: " + orcamento.getValor());
		System.out.println("=============");
	}
	// Exibi��o de or�amentos existentes,la�o for futuramente com uso de banco de dados
	public void listarOrcamento(Orcamento orcamento){
		System.out.println("==========================");
		System.out.println("Descri��o: " + orcamento.getDescricao());
		System.out.println("Per�odo: " + orcamento.getPeriodo());
		System.out.println("Valor total: " + orcamento.getValor());		
		System.out.println("==========================");
	}
	
	public void detalharOrcamento(Orcamento orcamento){
		System.out.println("==========================");
		System.out.println("Descri��o: " + orcamento.getDescricao());
		System.out.println("Per�odo: " + orcamento.getPeriodo());
		System.out.println("Valor total: " + orcamento.getValor());		
		System.out.println("==========================");
	}
	
	Orcamento orcamento1 = new Orcamento("Novo orcamento", 5, 15);
	Orcamento orcamento2 = new Orcamento("Outro orcamento", 9, 58);
	Orcamento orcamento3 = new Orcamento("Orcamento 3", 7, 74);

	
	
	private void processarOpcaoSelecionada(String opcao) {
		if(opcao.equals("1")){
			System.out.println("Op��o 1 selecionada!");
			cadastroOrcamento();
		}
		else if(opcao.equals("2")){
			System.out.println("Op��o 2 selecionada!");
			listarOrcamento(orcamento1);
			listarOrcamento(orcamento2);
			listarOrcamento(orcamento3);
		} 
		else if(opcao.equals("3")){
			System.out.println("Op��o 3 selecionada!");
			detalharOrcamento(orcamento1);
			
		} else if(opcao.equals("4")) {
			System.exit(0);
		}
	}
}
