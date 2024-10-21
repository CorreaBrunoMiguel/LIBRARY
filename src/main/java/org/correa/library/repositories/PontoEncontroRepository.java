package org.correa.library.repositories;

import org.correa.library.model.PontoEncontro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PontoEncontroRepository extends JpaRepository<PontoEncontro, Long> {
}
