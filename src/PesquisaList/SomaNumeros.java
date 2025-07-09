package PesquisaList;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributos
    private List<Numero> numerosList;

    //construtor

    public SomaNumeros(List<Numero> numerosList) {
        this.numerosList = numerosList;
    }

    //métodos

    public void adicionarNumero(int valor) {
        numerosList.add(new Numero(valor));
    }

    public int somaNumeros(){
        int somaNumeros = 0;
        if(!numerosList.isEmpty()) {
            for (Numero n : numerosList) {
                somaNumeros += n.getValor();
            }
        }
        return somaNumeros;
    }

    public int maiorNumero(){
        int maiorNumero = 0;
        if(!numerosList.isEmpty()) {
            maiorNumero = numerosList.get(0).getValor(); // Inicializa com o primeiro valor
            for (Numero n : numerosList) {
                if (n.getValor() > maiorNumero) {
                    maiorNumero = n.getValor();
                }
            }
        }
        return maiorNumero;
    }

    public int menorNumero(){
        int menorNumero = 0;
        if(!numerosList.isEmpty()) {
            menorNumero = numerosList.get(0).getValor(); // Inicializa com o primeiro valor
            for (Numero n : numerosList) {
                if (n.getValor() < menorNumero) {
                    menorNumero = n.getValor();
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if(!numerosList.isEmpty()) {
            System.out.println("Lista de Números:");
            for (Numero n : numerosList) {
                System.out.println(n);
            }
        } else {
            System.out.println("A lista de números está vazia.");
        }
    }

    //teste
    public static void main(String[] args) {
        List<Numero> numeros = new ArrayList<>();
        SomaNumeros somaNumeros = new SomaNumeros(numeros);

        somaNumeros.adicionarNumero(506);
        somaNumeros.adicionarNumero(102);
        somaNumeros.adicionarNumero(359);

        somaNumeros.exibirNumeros();
        System.out.println("Soma dos Números: " + somaNumeros.somaNumeros());
        System.out.println("Maior Número: " + somaNumeros.maiorNumero());
        System.out.println("Menor Número: " + somaNumeros.menorNumero());
    }
}
