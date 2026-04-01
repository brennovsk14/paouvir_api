package entities;

public class Musica {

    private String nome;
    private int duracao;
    private Album album;

    public Musica(String nome, Album album, int duracao) {
        this.nome = nome;
        this.album = album;
        this.duracao = duracao;
    }
}



