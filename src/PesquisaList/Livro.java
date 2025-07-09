package PesquisaList;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private String AnoPublicacao;

    //construtor
    public Livro(String titulo, String autor, String anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.AnoPublicacao = anoPublicacao;
    }
    //getters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnoPublicacao() {
        return AnoPublicacao;
    }

    //sobrescrevendo o metodo toString
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao='" + AnoPublicacao + '\'' +
                '}';
    }
}
