package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos
    private Set<Produto> produtosSet;

    //construtor
    public CadastroProdutos() {
        this.produtosSet = new HashSet<Produto>();
    }

    //metodos
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    //No exibir podemos dizer que é por nome, então vamos usar o Comparable no produto.
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosOrdenadosNome = new TreeSet<>(produtosSet);
        //treeSet é uma implementação de Set que ordena os elementos de acordo com o metodo compareTo da classe Produto.
        return produtosOrdenadosNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosOrdenadosPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        //treeSet é uma implementação de Set que ordena os elementos de acordo com o metodo compareTo da classe Produto.
        produtosOrdenadosPreco.addAll(produtosSet);
        return produtosOrdenadosPreco;
    }

    //Teste
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(1, "Produto A", 10.5, 5);
        cadastro.adicionarProduto(2, "Produto H", 5.0, 3);
        cadastro.adicionarProduto(2, "Produto F", 5.0, 3);
        cadastro.adicionarProduto(3, "Produto C", 1.3, 10);

        System.out.println("Produtos ordenados por nome:");
        System.out.println(cadastro.exibirProdutosPorNome());

        System.out.println("Produtos ordenados por preço:");
        System.out.println(cadastro.exibirProdutosPorPreco());
    }
}
