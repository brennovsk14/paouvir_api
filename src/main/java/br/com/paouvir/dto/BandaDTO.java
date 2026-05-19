package br.com.paouvir.dto;

public class BandaDTO {

    private Long id;
    private String nome;
    private Double nota;
    private String resumo;

    public BandaDTO() {}

    public BandaDTO(Long id, String nome, Double nota, String resumo) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
        this.resumo = resumo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getNota() {
        return nota;
    }

    public String getResumo() {
        return resumo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}