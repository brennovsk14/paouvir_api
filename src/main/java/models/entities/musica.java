public class Musica {

    private String nome;
    private int duracao;
    private Album album;

    public Musica(String nome) {
        this.nome = nome;
    }


    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}