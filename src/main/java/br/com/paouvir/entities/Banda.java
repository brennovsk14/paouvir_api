package br.com.paouvir.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Banda implements Comparable<Banda>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @OneToMany(mappedBy = "banda")
    private List<Album> albuns;
    private Double nota;
    private String resumo;

    public Banda() {}

    public Banda(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banda(" + "nome =" + nome + ", albuns =" + albuns +  ", nota =" + nota + ')';
    }

    @Override
    public int compareTo( Banda outraBanda) {

        return this.nome.compareTo(outraBanda.nome);
    }
}