package br.com.paouvir.entities;

import java.util.ArrayList;
import java.util.List;

public class Banda implements Comparable<Banda>{

    private String nome;
    private List<Album> albuns;
    private Double Nota;
    private String resumo;

    public Banda() {}

    public Banda(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banda(" + "nome =" + nome + ", albuns =" + albuns +  ", nota =" + Nota + ')';
    }

    @Override
    public int compareTo( Banda outraBanda) {

        return this.nome.compareTo(outraBanda.nome);
    }
}