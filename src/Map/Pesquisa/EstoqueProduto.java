package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    //atributos
    private Map<Long, Produto> estoqueProdutosMap;

    //construtor
    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    //metodos
    public void adicionarProduto(Long codigo, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double valorTotalEstoque(){
        double valorTotal = 0.0;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }


    //teste

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();

        // Adicionando produtos ao estoque
        estoque.adicionarProduto(1L, "Produto A", 10, 15.50);
        estoque.adicionarProduto(2L, "Produto B", 5, 25.00);
        estoque.adicionarProduto(3L, "Produto C", 20, 10.00);

        // Exibindo produtos no estoque
        System.out.println("Produtos no estoque:");
        estoque.exibirProdutos();

        // Calculando o valor total do estoque
        double valorTotal = estoque.valorTotalEstoque();
        System.out.println("Valor total do estoque: R$ " + valorTotal);

        // Obtendo o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    }
}
