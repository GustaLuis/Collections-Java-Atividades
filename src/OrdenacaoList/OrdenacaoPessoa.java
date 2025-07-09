package OrdenacaoList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    //atributos
    private List<Pessoa> pessoaList;

    //construtor
    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    //métodos
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //ordenar por idade usando a interface comparable
    //O comparable é uma interface que altera a class Pessoa, e por isso vamos lá add o Implements Comparable<Pessoa>
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        //estamos duplicando
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
        //o metodo sort vai entender que ele vai ter que ordenar pelo comparable.
    }

    //implementando o comparator para ordenar por altura
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        //estamos duplicando
        Collections.sort(pessoaPorAltura, new ComparatorAltura());
        return pessoaPorAltura;
        //o metodo sort vai entender que ele vai ter que ordenar pelo comparator.
    }

    //teste
    public static void main(String[] args) {
        OrdenacaoPessoa op = new OrdenacaoPessoa();
        op.adicionarPessoa("Alice", 30, 1.65);
        op.adicionarPessoa("Bob", 25, 1.80);
        op.adicionarPessoa("Charlie", 35, 1.75);

        System.out.println("Lista de Pessoas:");
        System.out.println(op.pessoaList);

        System.out.println("Ordenado por Idade:");
        System.out.println(op.ordenarPorIdade());

        System.out.println("\nOrdenado por Altura:");
        System.out.println(op.ordenarPorAltura());
    }
}
