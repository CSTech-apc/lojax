package br.com.cstech.backend.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cstech.backend.domain.entities.EntEstado;

@Repository
public interface ReposEstado extends JpaRepository<EntEstado, Long> {
  // pode usar todos os métodos JpaRepository e os que estiverem nesse espaço...
}
