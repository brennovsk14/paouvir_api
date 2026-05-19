package br.com.paouvir.service;

import br.com.paouvir.entities.Album;
import br.com.paouvir.repositories.AlbumRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    private final AlbumRepository albumRepository;

    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public Album salvar(Album album) {
        return albumRepository.save(album);
    }

    public List<Album> listar() {
        return albumRepository.findAll();
    }

    public Album buscarPorId(Long id) {
        return albumRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Álbum não encontrado"));
    }

    public void deletar(Long id) {
        albumRepository.deleteById(id);
    }
}