package br.com.paouvir.service;

import br.com.paouvir.entities.Avaliacao;
import br.com.paouvir.entities.Banda;
import br.com.paouvir.repositories.AvaliacaoRepository;
import br.com.paouvir.repositories.BandaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandaService {

    private final BandaRepository bandaRepository;
    private final AvaliacaoRepository avaliacaoRepository;

    public BandaService(BandaRepository bandaRepository,
                        AvaliacaoRepository avaliacaoRepository) {
        this.bandaRepository = bandaRepository;
        this.avaliacaoRepository = avaliacaoRepository;
    }

    public Banda salvar(Banda banda) {
        return bandaRepository.save(banda);
    }

    public List<Banda> listar() {
        return bandaRepository.findAll();
    }

    public Double calcularNota(Banda banda) {
        return avaliacaoRepository.findByBanda(banda)
                .stream()
                .mapToDouble(Avaliacao::getNota)
                .average()
                .orElse(0.0);
    }
}