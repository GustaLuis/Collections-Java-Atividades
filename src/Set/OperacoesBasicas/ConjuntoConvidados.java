package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadosSet;

    //construtor

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<Convidado>();
    }

    //métodos
    public void adicionarConvidado(String nome, int codigoConvidado) {
        convidadosSet.add(new Convidado(nome,codigoConvidado));
    }

    public void removerConvidadoPorCodigo(int codigoConvidado) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvidado) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int ContarConvidados() {
        return convidadosSet.size();
    }

    public void listarConvidados() {
        if (!convidadosSet.isEmpty()) {
            for (Convidado c : convidadosSet) {
                System.out.println(c);
            }
        } else {
            System.out.println("Nenhum convidado cadastrado.");
        }
    }

    //Teste
    public static void main(String[] args) {
        ConjuntoConvidados cc = new ConjuntoConvidados();
        cc.adicionarConvidado("Alice", 101);
        cc.adicionarConvidado("Bob", 102);
        cc.adicionarConvidado("Charlie", 101); // Tentativa de adicionar um convidado com código duplicado

        System.out.println("Lista de Convidados:");
        cc.listarConvidados();

        System.out.println("\nTotal de Convidados: " + cc.ContarConvidados());

        cc.removerConvidadoPorCodigo(102);
        System.out.println("\nLista de Convidados após remoção:");
        cc.listarConvidados();
    }



}
