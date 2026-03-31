public class Album {

    private String nome;
    private list<Musica> musicas;
    private Banda banda;

    public Album(String nome) {
        this.nome = nome;
    }

    public list<musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(list<musica> musicas) {
        this.musicas = musicas;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}