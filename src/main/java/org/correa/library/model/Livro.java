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
@Table(name = "livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String titulo;
    private Integer anoPublicacao;
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @ElementCollection
    private List<String> imagemPath;
}
