package br.com.paouvir.controller;

import br.com.paouvir.entities.Musica;
import br.com.paouvir.service.MusicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    private final MusicaService musicaService;

    public MusicaController(MusicaService musicaService) {
        this.musicaService = musicaService;
    }

    @PostMapping
    public ResponseEntity<Musica> criar(@RequestBody Musica musica) {
        return ResponseEntity.ok(musicaService.salvar(musica));
    }

    @GetMapping
    public ResponseEntity<List<Musica>> listar() {
        return ResponseEntity.ok(musicaService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Musica> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(musicaService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        musicaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
