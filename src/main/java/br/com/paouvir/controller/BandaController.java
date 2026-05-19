package br.com.paouvir.controller;

import br.com.paouvir.entities.Banda;
import br.com.paouvir.service.BandaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bandas")
public class BandaController {

    private final BandaService service;

    public BandaController(BandaService service) {
        this.service = service;
    }

    @PostMapping
    public Banda criar(@RequestBody Banda banda) {
        return service.salvar(banda);
    }

    @GetMapping
    public List<Banda> listar() {
        return service.listar();
    }
}
