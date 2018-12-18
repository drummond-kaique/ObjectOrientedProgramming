package br.edu.ifpb.armazenamento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.edu.ifpb.dominio.Zoologico;
import br.edu.ifpb.exceptions.ZooException;
import br.edu.ifpb.geradorId.GeradorId;

public class ArmazenamentoEmArquivoBinario implements Armazenamento {

	private String nomeArquivo;

	public ArmazenamentoEmArquivoBinario(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public Zoologico recuperar(GeradorId geradorId) throws ZooException {
		Zoologico zoo = null;

		try (FileInputStream fis = new FileInputStream(this.nomeArquivo);
			 ObjectInputStream ois = new ObjectInputStream(fis);) {
			zoo = (Zoologico) ois.readObject();
			zoo.setGeradorId(geradorId);
		} catch (FileNotFoundException e) {
			// primeira vez que o programa está sendo executado armazenando a base de dados
			// neste arquivo?
			zoo = new Zoologico(geradorId);
		} catch (IOException | ClassNotFoundException e) {
			throw new ZooException("Houve algum erro ao tentar recuperar os dados do zoológico!", e);
		}

		return zoo;
	}

	public void armazenar(Zoologico zoo) throws ZooException {
		try (FileOutputStream fos = new FileOutputStream(this.nomeArquivo);
			 ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(zoo);
		} catch (IOException e) {
			throw new ZooException("Houve algum erro ao tentar armazenar os dados do zoológico!", e);
		}
	}

}
