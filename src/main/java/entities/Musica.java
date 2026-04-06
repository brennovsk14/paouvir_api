package entities;

import org.jspecify.annotations.NonNull;

public class Musica implements Comparable<Musica>{

    private String nome;
    private int duracao;
    private Album album;
    private Banda banda;

    public Musica(String nome, Album album, int duracao, Banda banda) {
        this.nome = nome;
        this.album = album;
        this.duracao = duracao;
        this.banda = banda;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", duracao =" + duracao +
                ", album =" + album +
                ", banda =" + banda +
                '}';
    }

    @Override
    public int compareTo(Musica outraMusica) {
        return 0;
    }
}



