package List.PesquisaList;

public class Numero implements Comparable<Numero>{
    //atributos
    private int valor;

    //construtor

    public Numero(int valor) {
        this.valor = valor;
    }

    //getters

    public int getValor() {
        return valor;
    }

    //sobrescrevendo o metodo toString

    @Override
    public String toString() {
        return "Numero{" +
                "valor=" + valor +
                '}';
    }

    //metodo compareTo para ordenar números
    //metodo ascendente menor para maior, comum do metodo compareTo
    @Override
    public int compareTo(Numero c) {
        return Integer.compare(this.valor, c.getValor());
    }


}
