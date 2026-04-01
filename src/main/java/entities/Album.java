package entities;
import java.util.List;

public class Album {

    private String nome;
    private List<Musica> musicas;
    private Banda banda;

    public Album(String nome, Banda banda) {
        this.nome = nome;
        this.banda = banda;
    }
}
