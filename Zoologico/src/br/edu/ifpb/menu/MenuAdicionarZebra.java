package br.edu.ifpb.menu;

import java.util.Scanner;

import br.edu.ifpb.dominio.Zebra;
import br.edu.ifpb.dominio.Zoologico;
import br.edu.ifpb.exceptions.ZooException;

public class MenuAdicionarZebra extends AbstractMenu implements Menu {

	public MenuAdicionarZebra(Zoologico zoo, Scanner sc) {
		super(zoo, sc);
	}

	@Override
	public boolean exibirMenu() throws ZooException {
		String menu = "";
		menu += "====================================" + LS;
		menu += "Adicionar Zebra - Aplicação Zoológico" + LS;
		menu += "====================================" + LS;
		System.out.println(menu);
		
		String nome = obterValorString("Informe o nome: ");
		Integer quantidadeListras = obterValorInteger("Informe a quantidade de listras: ");
		Zebra animal = new Zebra(nome, quantidadeListras);
		this.zoo.adicionarAnimal(animal);
		
		System.out.println();
		System.out.println("Zebra adicionada com sucesso!");
		System.out.println();
		return true;
	}

}
