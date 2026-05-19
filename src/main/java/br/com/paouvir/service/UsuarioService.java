package br.com.paouvir.service;

import br.com.paouvir.dto.UsuarioDTO;
import br.com.paouvir.entities.Usuario;
import br.com.paouvir.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public UsuarioDTO cadastrar(UsuarioDTO dto) {
        Usuario usuario = new Usuario(
                dto.getNome(),
                dto.getEmail(),
                dto.getSenha()
        );

        usuario = repository.save(usuario);

        return new UsuarioDTO(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail()
        );
    }

    public UsuarioDTO login(UsuarioDTO dto) {
        Optional<Usuario> usuarioOpt = repository.findByEmail(dto.getEmail());

        if (usuarioOpt.isEmpty()) {
            throw new RuntimeException("Usuário não encontrado");
        }

        Usuario usuario = usuarioOpt.get();

        if (!usuario.getSenha().equals(dto.getSenha())) {
            throw new RuntimeException("Senha inválida");
        }

        return new UsuarioDTO(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail()
        );
    }
}
