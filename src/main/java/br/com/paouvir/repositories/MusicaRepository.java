package br.com.paouvir.repositories;

import br.com.paouvir.entities.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepository extends JpaRepository<Musica, Long> {

}