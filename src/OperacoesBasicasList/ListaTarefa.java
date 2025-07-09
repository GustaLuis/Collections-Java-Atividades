package OperacoesBasicasList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefas> tarefaList;

    //construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //métodos
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for (Tarefas t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int quantidadeTarefas() {
        return tarefaList.size();
    }

    public void ObterDescricaoTarefas() {
        if (tarefaList.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            System.out.println(tarefaList);
        }
    }

    //testes
    public static void main(String[] args) {
        //Ctrl + D para duplicar a linha
        //Ctrl + Shift + seta para baixo para mover a linha

        ListaTarefa lista = new ListaTarefa();
        System.out.println("O número de elementos na lista é: " + lista.quantidadeTarefas());

        lista.adicionarTarefa("Estudando Java");
        lista.adicionarTarefa("Estudando Python");
        lista.adicionarTarefa("Estudando Python");
        System.out.println("O número de elementos na lista é: " + lista.quantidadeTarefas());

        //removendo uma tarefa
        lista.removerTarefa("Estudando Python");
        System.out.println("O número de elementos na lista é: " + lista.quantidadeTarefas());

        /*obtendo a descricao das tarefas, porém ira mostrar o endereço então
        temos que ir em Tarefas.java e sobrescrever o metodo toString*/
        lista.ObterDescricaoTarefas();
    }
}
