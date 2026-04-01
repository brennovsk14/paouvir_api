package entities;
import java.util.List;

public class Banda {

    private String nome;
    private List<Album> albuns;
    private List<Musica> musicas;

    public Banda(String nome) {
        this.nome = nome;
    }
}