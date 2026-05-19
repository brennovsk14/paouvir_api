package br.com.paouvir.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Album implements Comparable<Album>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @OneToMany(mappedBy = "album")
    private List<Musica> musicas = new ArrayList<>();
    private Double nota;
    private Float duracaoTotal;
    @ManyToOne
    @JoinColumn(name = "banda_id")
    private Banda banda;

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
