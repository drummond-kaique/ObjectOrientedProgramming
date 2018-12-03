package br.edu.ifpb.cg.q3.Produtos;

import br.edu.ifpb.cg.q3.MinhaData;

public class Detergente extends Produto {

    private boolean neutro;

    public Detergente(String marca, Integer quatidade, MinhaData dataValidade, boolean neutro) {
        super(marca, quatidade, dataValidade);
        this.neutro = neutro;
    }

    public boolean isNeutro() {
        return neutro;
    }

    public void setNeutro(boolean neutro) {
        this.neutro = neutro;
    }

    @Override
    public String toString() {
        return "Detergente{" +
                "id: " + super.getId() + " " +
                "marca: '" + super.getMarca() + " " +
                "quatidade: " + super.getQuatidade() + " " +
                "dataValidade: " + super.getDataValidade() + " " +
                "neutro: " + neutro +
                '}';
    }
}
