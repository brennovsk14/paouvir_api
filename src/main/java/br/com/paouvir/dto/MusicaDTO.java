package br.com.paouvir.dto;

public class MusicaDTO {

    private Long id;
    private String nome;
    private int duracao;
    private String descricaoResumida;
    private Long albumId;

    public MusicaDTO() {}

    public MusicaDTO(Long id, String nome,
                     int duracao,
                     String descricaoResumida,
                     Long albumId) {

        this.id = id;
        this.nome = nome;
        this.duracao = duracao;
        this.descricaoResumida = descricaoResumida;
        this.albumId = albumId;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getDescricaoResumida() {
        return descricaoResumida;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setDescricaoResumida(String descricaoResumida) {
        this.descricaoResumida = descricaoResumida;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }
}
