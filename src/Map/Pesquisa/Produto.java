package Map.Pesquisa;

public class Produto {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    //construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //sobrescrevendo o metodo toString

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
    /* Não sobrescrevemos equals e hashCode porque o Map utiliza chaves únicas.
   Como a chave já garante unicidade, o Map não permite duplicidade de entradas.
   Assim, não é necessário comparar diretamente os objetos do tipo Produto. */
}
