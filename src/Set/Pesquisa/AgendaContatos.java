package Set.Pesquisa;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatosSet;

    //construtor
    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    //métodos
    public void adicionarContato(String nome, String telefone) {
        contatosSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);
    }

    /*No pesquisar por nome, vamos retornar todos os contatos que possuem o nome informado.
    independente do sobrenome caso seja digitado somente o primeiro nome.*/

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato c : contatosSet) {
            if (c.getNome().startsWith(nome)) {
                contatosEncontrados.add(c);
            }
        }
        return contatosEncontrados;
    }

    public Contato AtualizarNumeroContato(String nome, String novoTelefone) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    //Teste
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Alice", "1234-5678");
        agenda.adicionarContato("Alvaro", "1234-5578");
        agenda.adicionarContato("Bob", "9876-5432");
        agenda.adicionarContato("Charlie", "5555-5555");

        System.out.println("Lista de Contatos:");
        agenda.exibirContatos();

        System.out.println("\nPesquisar por nome 'Al':");
        Set<Contato> encontrados = agenda.pesquisarPorNome("Al");
        System.out.println(encontrados);

        System.out.println("\nAtualizar número de contato 'Alice':");
        Contato atualizado = agenda.AtualizarNumeroContato("Alice", "1111-1111");
        System.out.println("Contato atualizado: " + atualizado);
    }

}
