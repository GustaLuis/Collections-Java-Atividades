package List.OrdenacaoList;

import List.PesquisaList.Numero;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributos
    private List<Numero> numerosList;

    // Construtor
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    // Métodos
    public void adicionarNumero(int numero) {
        numerosList.add(new Numero(numero));
    }

    //ordenarAscendente
    public List<Numero> ordenarAscendente() {
        List<Numero> numerosAscendentes = new ArrayList<>(numerosList);
        // Estamos duplicando a lista para não alterar a original
        Collections.sort(numerosAscendentes); // Usa o compareTo de Numero
        return numerosAscendentes;
    }

    //ordenarDescendente
    public List<Numero> ordenarDescendente() {
        List<Numero> numerosDescendentes = new ArrayList<>(numerosList);
        // Estamos duplicando a lista para não alterar a original
        Collections.sort(numerosDescendentes, Collections.reverseOrder()); // Usa o compareTo de Numero
        return numerosDescendentes;
    }

    // Teste
    public static void main(String[] args) {
        OrdenacaoNumeros on = new OrdenacaoNumeros();
        on.adicionarNumero(5);
        on.adicionarNumero(2);
        on.adicionarNumero(8);
        on.adicionarNumero(1);
        on.adicionarNumero(3);

        System.out.println("Lista de Números:");
        System.out.println(on.numerosList);

        System.out.println("Ordenado Ascendente:");
        System.out.println(on.ordenarAscendente());

        System.out.println("Ordenado Descendente:");
        System.out.println(on.ordenarDescendente());
    }
}
