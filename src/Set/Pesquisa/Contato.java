package Set.Pesquisa;

import java.util.Objects;

public class Contato {
    //atributos
    private String nome;
    private String telefone;

    //construtor
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    //setters numero
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Não podemos ter nomes iguais no contato.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    //sobrescrevendo o metodo toString
    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
