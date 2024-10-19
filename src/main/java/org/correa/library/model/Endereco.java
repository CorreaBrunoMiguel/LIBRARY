package org.correa.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String rua;
    private String bairro;
    private String numero;
    private String complemento;

    @OneToOne(mappedBy = "endereco")
    private PontoEncontro pontoEncontro;

}
