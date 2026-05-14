package br.com.paouvir.entities;

public class Musica implements Comparable<Musica>{

    private String nome;
    private int duracao;
    private String DescricaoResumida;

    public Musica() {}

    public Musica(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Musica(" + "nome=" + nome  + ", duracao =" + duracao + " minutos" + ", album =" + ", banda =" + ')';
    }

    @Override
    public int compareTo( Musica outraMusica) {

        return this.nome.compareTo(outraMusica.nome);
    }

}



