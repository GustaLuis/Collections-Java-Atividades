package List.PesquisaList;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos
    private List<Livro> livroList;

    //construtor
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //métodos
    public void adicionarLivro(String titulo, String autor, String anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalosAnos(int anoInicio, int anoFim) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (Integer.parseInt(l.getAnoPublicacao()) >= anoInicio && Integer.parseInt(l.getAnoPublicacao()) <= anoFim){
                    livrosPorIntervalo.add(l);
                }
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    //Set.teste
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogo.adicionarLivro("Java Programming", "John Doe", "2020");
        catalogo.adicionarLivro("Python Basics", "Jane Smith", "2019");
        catalogo.adicionarLivro("Advanced Java", "John Doe", "2021");

        // Pesquisando por autor
        List<Livro> livrosPorAutor = catalogo.pesquisarPorAutor("John Doe");
        System.out.println("Livros de John Doe: " + livrosPorAutor);

        // Pesquisando por intervalo de anos
        List<Livro> livrosPorIntervalo = catalogo.pesquisarPorIntervalosAnos(2019, 2020);
        System.out.println("Livros publicados entre 2019 e 2020: " + livrosPorIntervalo);

        // Pesquisando por título
        Livro livroPorTitulo = catalogo.pesquisarPorTitulo("Python Basics");
        System.out.println("Livro encontrado: " + livroPorTitulo);
    }
}
