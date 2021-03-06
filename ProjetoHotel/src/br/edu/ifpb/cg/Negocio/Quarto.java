package br.edu.ifpb.cg.Negocio;
import br.edu.ifpb.cg.TemRepresentacaoTextual;

import java.io.Serializable;
import java.util.Objects;

public abstract class Quarto implements Serializable, TemRepresentacaoTextual {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer numero;
    private Integer andar;
    private Integer quantidadeMaximaPessoas;

    public Quarto(Long id, Integer numero, Integer andar, Integer quantidadeMaximaPessoas) {
        this.id = id;
        this.numero = numero;
        this.andar = andar;
        this.quantidadeMaximaPessoas = quantidadeMaximaPessoas;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public Integer getQuantidadeMaximaPessoas() {
        return quantidadeMaximaPessoas;
    }

    public void setQuantidadeMaximaPessoas(Integer quantidadeMaximaPessoas) {
        this.quantidadeMaximaPessoas = quantidadeMaximaPessoas;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quarto quarto = (Quarto) o;
        return Objects.equals(id, quarto.id) &&
                Objects.equals(numero, quarto.numero) &&
                Objects.equals(andar, quarto.andar) &&
                Objects.equals(quantidadeMaximaPessoas, quarto.quantidadeMaximaPessoas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero, andar, quantidadeMaximaPessoas);
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "  id=" + id +
                ", numero=" + numero +
                ", andar=" + andar +
                ", quantidadeMaximaPessoas=" + quantidadeMaximaPessoas +
                '}';
    }


    @Override
    public String imprimir() {

        String representacao = "";

        representacao += "\nQuarto:";
        representacao += "\nId: " + id;
        representacao += "\nNumero: " + numero;
        representacao += "\nAndar: " + andar;
        representacao += "\nQtdeMaxPessoas: " + quantidadeMaximaPessoas + "\n";

        return representacao;
    }

    @Override
    public String imprimirCompacto() {
        String representacao = "";
        representacao += "\nQuarto: " + getClass().getSimpleName();
        representacao += "\nId: " + id + "\n";
        return representacao;
    }
}
