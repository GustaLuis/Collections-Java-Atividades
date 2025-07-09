package Map.Ordenacao;

public class Evento {
    //atributos
    private String nomeEvento;
    private String nomeAtracao;
    //podemos mudar o nomeAtracao para uma collection, ela pode ser um list,set ou map

    //construtor
    public Evento(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    //getters
    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    //sobrescrevendo o metodo toString

    @Override
    public String toString() {
        return "Evento{" +
                "nomeEvento='" + nomeEvento + '\'' +
                ", nomeAtracao='" + nomeAtracao + '\'' +
                '}';
    }
}
