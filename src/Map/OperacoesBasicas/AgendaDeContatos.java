package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {
    //atributos
    private Map<String, Integer> agendaContatosMap;

    //construtor
    public AgendaDeContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    //metodos
    public void adicionarContato(String nome, int telefone) {
        //Para adicionar um contato, usamos o put no Map! Não Add como no List e Set!
        agendaContatosMap.put(nome, telefone);
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome,telefone);
    }

    public void removerContato(String nome) {
        //Para remover um contato, usamos o remove no Map! Não Remove como no List e Set!
        if(!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void listarContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    //Teste
    public static void main(String[] args) {
        AgendaDeContatos agenda = new AgendaDeContatos();

        /* O metodo put em MAP serve tanto para adicionar quanto para atualizar a lista!
        * então se passar o mesmo nome de contato e numero diferente ele irá atualizar o numero! */

        // Adicionando contatos
        agenda.adicionarContato("Alice", 123456789);
        agenda.adicionarContato("Alice", 85497);
        agenda.adicionarContato("Bob", 987654321);
        agenda.adicionarContato("Bobs", 987654321);
        agenda.adicionarContato("Bobye", 987654321);

        // Listando contatos
        System.out.println("Contatos na agenda:");
        agenda.listarContatos();

        // Pesquisando por nome
        String nomeParaPesquisar = "Alice";
        Integer telefone = agenda.pesquisarPorNome(nomeParaPesquisar);
        if (telefone != null) {
            System.out.println("Telefone de " + nomeParaPesquisar + ": " + telefone);
        } else {
            System.out.println(nomeParaPesquisar + " não encontrado na agenda.");
        }

        // Removendo um contato
        agenda.removerContato("Bob");

        // Listando contatos após remoção
        System.out.println("Contatos na agenda após remoção:");
        agenda.listarContatos();
    }

}
