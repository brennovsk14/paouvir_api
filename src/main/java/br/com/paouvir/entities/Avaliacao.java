package br.com.paouvir.entities;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double nota;

    @ManyToOne
    private Banda banda;

    @ManyToOne
    private Album album;

    @ManyToOne
    private Musica musica;
}
