package br.com.paouvir.entities;

public class Principal {

    public static void main(String[] args) {
        Banda banda = new Banda("Banda X");
        Album album = new Album("Album Y");
        Musica musica = new Musica("Musica Z",240);

        System.out.println(banda);
        System.out.println(album);
        System.out.println(musica);
    }
}
