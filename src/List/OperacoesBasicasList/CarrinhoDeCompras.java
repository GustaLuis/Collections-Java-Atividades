package List.OperacoesBasicasList;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Atributo (criando nossa List de Item)
    private List<Item> itensList;

    //Construtor (inicializando a lista de itens);
    /*O construtor CarrinhoDeCompras() está sendo inicializado sem parâmetros para garantir que,
    ao criar um novo objeto dessa classe, a lista de itens (itensList) comece sempre vazia. Isso
    facilita o uso da classe, pois não exige que o usuário forneça uma lista de itens ao criar o
    carrinho; ele pode adicionar itens depois, conforme necessário. É uma prática comum para
    inicializar coleções internas de uma classe.*/

    public CarrinhoDeCompras(){
        this.itensList = new ArrayList<Item>();
    }

    //Métodos
    public void adicionarItem(String nome, Double preco, int quantidade) {
        Item novoItem = new Item(nome, preco, quantidade);
        itensList.add(novoItem);
    }

    public void removerItem(String nomeItem) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : itensList) {
            if (item.getNome().equalsIgnoreCase(nomeItem)) {
                itensParaRemover.add(item);
            }
        }
        itensList.removeAll(itensParaRemover);
    }
    public double calcularValorTotal() {
        double total = 0.0;
        for (Item item : itensList) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        if (itensList.isEmpty()) {
            System.out.println("Nenhum item no carrinho.");
        } else {
                System.out.println(itensList);
        }
    }

    //Metodo main para testes
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinho.adicionarItem("Camiseta", 29.99, 2);
        carrinho.adicionarItem("Calça Jeans", 59.99, 1);
        carrinho.adicionarItem("Tênis", 89.99, 1);

        // Exibindo itens no carrinho
        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();

        // Calculando o valor total do carrinho
        double total = carrinho.calcularValorTotal();
        System.out.println("Valor total do carrinho: R$ " + total);

        // Removendo um item do carrinho
        carrinho.removerItem("Camiseta");

        // Exibindo itens após remoção
        System.out.println("Itens no carrinho após remoção:");
        carrinho.exibirItens();
    }
}
