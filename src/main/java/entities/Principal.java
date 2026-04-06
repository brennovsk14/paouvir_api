package entities;

public class Principal {
    public static void main(String[] args) {
        Banda banda = new Banda("Banda X");
        Album album = new Album("Album Y", banda);
        Musica musica = new Musica("Musica Z", album, 240, banda);

        System.out.println(banda);
        System.out.println(album);
        System.out.println(musica);
    }
}
