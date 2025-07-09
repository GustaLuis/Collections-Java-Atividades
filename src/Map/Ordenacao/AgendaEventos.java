package Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    //atributos
    private Map<LocalDate, Evento> eventosMap;
    //estamos trabalhando com datas no caso localData mas poderia trabalhar com varias outras.

    //construtor
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    //metodos
    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
        eventosMap.put(data, new Evento(nomeEvento, nomeAtracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        //agora o treeMap irá ordenar os eventos por data automaticamente, por causa do eventosMap
        System.out.println("Eventos: " + eventosTreeMap);
    }

    public void proximoEvento(){
        /*Set<LocalDate> dateSet = eventosMap.keySet();
        //retorna um set com as chaves do map, no caso as datas dos eventos
        Collections<Evento> values = eventosMap.values();
        //retorna uma collection com os valores do map, no caso os eventos
        //eventosMap.get();
        */

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        //nesse map já temos os eventos por ordem crescente de data
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Próximo evento: " + proximoEvento + " na data: " + proximaData);
                return;
            }
        }


    }

    //Teste
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        // Adicionando eventos
        agenda.adicionarEvento(LocalDate.of(2024, 10, 15), "Show de Rock", "Banda X");
        agenda.adicionarEvento(LocalDate.of(2025, 11, 20), "Festival de Jazz", "Banda Y");
        agenda.adicionarEvento(LocalDate.of(2025, 12, 5), "Concerto Clássico", "Orquestra Z");

        // Exibindo a agenda
        agenda.exibirAgenda();

        // Verificando o próximo evento
        agenda.proximoEvento();
    }

}
