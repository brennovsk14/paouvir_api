package br.com.paouvir.service;

import br.com.paouvir.entities.Musica;
import br.com.paouvir.repositories.MusicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaService {

    private final MusicaRepository musicaRepository;

    public MusicaService(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }

    public Musica salvar(Musica musica) {
        return musicaRepository.save(musica);
    }

    public List<Musica> listar() {
        return musicaRepository.findAll();
    }

    public Musica buscarPorId(Long id) {
        return musicaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Música não encontrada"));
    }

    public void deletar(Long id) {
        musicaRepository.deleteById(id);
    }
}
