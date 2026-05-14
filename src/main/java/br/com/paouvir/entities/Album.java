package br.com.paouvir.entities;

import java.util.ArrayList;
import java.util.List;

public class Album implements Comparable<Album>{

    private String nome;
    private List<Musica> musicas;
    private Double nota;
    private Float duracaoTotal;

    public Album() {}

    public Album(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Album(" + "nome =" + nome + ", musicas =" + musicas + ')';
    }

    @Override
    public int compareTo(Album outroAlbum) {
        return this.nome.compareTo(outroAlbum.nome);
    }
}
