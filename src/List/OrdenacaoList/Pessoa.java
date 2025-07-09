package List.OrdenacaoList;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    //atributos
    private String nome;
    private int idade;
    private double altura;

    //construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //Do metodo compareTo, que é obrigatório implementar quando usamos a interface Comparable
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade,p.getIdade());
    }

    //getters

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    //sobrescrevendo o metodo toString

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

//ordenar por altura usando a interface comparator
class ComparatorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
    //acima temos o metodo de comparacao por altura
}
