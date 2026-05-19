package br.com.paouvir.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Musica implements Comparable<Musica>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int duracao;
    private String descricaoResumida;
    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;

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



