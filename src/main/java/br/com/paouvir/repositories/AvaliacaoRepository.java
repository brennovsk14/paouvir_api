package br.com.paouvir.repositories;

import br.com.paouvir.entities.Avaliacao;
import br.com.paouvir.entities.Banda;
import br.com.paouvir.entities.Album;
import br.com.paouvir.entities.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {

    List<Avaliacao> findByBanda(Banda banda);

    List<Avaliacao> findByAlbum(Album album);

    List<Avaliacao> findByMusica(Musica musica);
}
