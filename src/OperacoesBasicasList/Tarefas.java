package OperacoesBasicasList;

public class Tarefas {
    //atributo
    private String descricao;

    public Tarefas(String descricao) {
        this.descricao = descricao;
    }

    //metodo get para o atributo privado
    public String getDescricao() {
        return descricao;
    }

    //toString

    @Override
    public String toString() {
        return descricao;
    }
}
