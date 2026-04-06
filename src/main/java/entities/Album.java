package entities;
import org.jspecify.annotations.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Album implements Comparable<Album>{

    private String nome;
    private List<Musica> musicas;
    private Banda banda;

    public Album(String nome, Banda banda) {
        this.nome = nome;
        this.banda = banda;
        this.musicas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Album{" +
                "nome ='" + nome + '\'' +
                ", musicas =" + musicas +
                ", banda =" + banda +
                '}';
    }

    @Override
    public int compareTo(Album outroAlbum) {
        return 0;
    }
}
