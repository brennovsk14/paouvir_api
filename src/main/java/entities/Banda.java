package entities;
import org.jspecify.annotations.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Banda implements Comparable<Banda>{

    private String nome;
    private List<Album> albuns;
    private List<Musica> musicas;

    public Banda(String nome) {
        this.nome = nome;
        this.albuns = new ArrayList<>();
        this.musicas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Banda(" + "nome =" + nome + ", albuns =" + albuns + ", musicas =" + musicas + ')';
    }

    @Override
    public int compareTo( Banda outraBanda) {
        return 0;
    }
}