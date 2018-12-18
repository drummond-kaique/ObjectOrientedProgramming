package br.edu.ifpb.menu;

import java.util.Scanner;

import br.edu.ifpb.dominio.Cobra;
import br.edu.ifpb.dominio.Zoologico;
import br.edu.ifpb.exceptions.ZooException;

public class MenuAdicionarCobra extends AbstractMenu implements Menu {

	public MenuAdicionarCobra(Zoologico zoo, Scanner sc) {
		super(zoo, sc);
	}

	@Override
	public boolean exibirMenu() throws ZooException {
		String menu = "";
		menu += "====================================" + LS;
		menu += "Adicionar Cobra - Aplicação Zoológico" + LS;
		menu += "====================================" + LS;
		System.out.println(menu);
		
		String nome = obterValorString("Informe o nome: ");
		Boolean ehVenenosa = obterValorBoolean("Informe se a cobra é venenosa (Sim ou Não): ");
		Cobra animal = new Cobra(nome, ehVenenosa);
		this.zoo.adicionarAnimal(animal);
		
		System.out.println();
		System.out.println("Cobra adicionada com sucesso!");
		System.out.println();
		return true;
	}

}
