package br.com.paouvir.dto;

public class AlbumDTO {

    private Long id;
    private String nome;
    private Double nota;
    private Float duracaoTotal;
    private Long bandaId;

    public AlbumDTO() {}

    public AlbumDTO(Long id, String nome, Double nota,
                    Float duracaoTotal, Long bandaId) {

        this.id = id;
        this.nome = nome;
        this.nota = nota;
        this.duracaoTotal = duracaoTotal;
        this.bandaId = bandaId;
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

    public Float getDuracaoTotal() {
        return duracaoTotal;
    }

    public Long getBandaId() {
        return bandaId;
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

    public void setDuracaoTotal(Float duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }

    public void setBandaId(Long bandaId) {
        this.bandaId = bandaId;
    }
}