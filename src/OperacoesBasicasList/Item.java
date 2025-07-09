package OperacoesBasicasList;

public class Item {
    //Atributos
    private String nome;
    private Double preco;
    private int quantidade;

    /*Construtor da classe Item! inicializa os atributos nome, preco e quantidade
    quando um novo objeto da classe é criado.*/

    public Item(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //getters para os atributos privados

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    /*Sobrescrevendo o método toString
    para exibir os detalhes do item de forma legível*/

    @Override
    public String toString() {
        return "\nItem: nome: " + nome + ", preco: " + preco + ", quantidade: " + quantidade;
    }
}