package br.com.mirante.orçamentosis.view;

import java.util.Scanner;

public class InterfaceUsuario {
	
	public void ImprimirMenu() {
		System.out.println("Digite o número da opção desejada:");
		System.out.println("[1]Cadastrar orçamento");
		System.out.println("[2]Listar orçamento");
		System.out.println("[3]Detalhar orçamento");
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
			System.out.println("Opção inválida, tente novamente!");
			ImprimirMenu();
			opcao = scanner.next();
		}
		processarOpcaoSelecionada(opcao); 
		
		
		System.out.println(opcao);
		scanner.close();
	}
	private void processarOpcaoSelecionada(String opcao) {
		if(opcao.equals("1")){
			System.out.println("Opção 1 selecionada!");
		}
		else if(opcao.equals("2")){
			System.out.println("Opção 2 selecionada!");
		} 
		else if(opcao.equals("3")){
			System.out.println("Opção 3 selecionada!");
		} else if(opcao.equals("4")) {
			System.exit(0);
		}
	}
}
