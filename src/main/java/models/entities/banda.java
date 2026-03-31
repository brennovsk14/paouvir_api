public class Banda {

    private String nome;
    private albuns[] albuns;
    private list<Musica> musicas;

    public Banda(String nome) {
        this.nome = nome;
    }


    public musicas[] getMusicas() {
        return musicas;
    }

    public void setMusicas(musicas[] musicas) {
        this.musicas = musicas;
    }

    public albuns[] getAlbuns() {
        return albuns;
    }

    public void setAlbuns(albuns[] albuns) {
        this.albuns = albuns;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}