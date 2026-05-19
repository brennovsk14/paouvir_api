package br.com.paouvir.controller;

import br.com.paouvir.dto.UsuarioDTO;
import br.com.paouvir.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public UsuarioDTO cadastrar(@RequestBody UsuarioDTO dto) {
        return service.cadastrar(dto);
    }

    @PostMapping("/login")
    public UsuarioDTO login(@RequestBody UsuarioDTO dto) {
        return service.login(dto);
    }
}
