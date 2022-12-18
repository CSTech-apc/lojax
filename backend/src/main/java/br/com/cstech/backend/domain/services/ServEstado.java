package br.com.cstech.backend.domain.services;

import br.com.cstech.backend.domain.entities.EntEstado;
import br.com.cstech.backend.domain.repositories.ReposEstado;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServEstado { // regras de negócio

  @Autowired
  private ReposEstado reposEstado;

  public List<EntEstado> readAll() {
    return reposEstado.findAll();
  }

  public EntEstado created(EntEstado entEstado) {
    entEstado.setData_created_est(new Date());
    EntEstado created = reposEstado.saveAndFlush(entEstado);
    return created;
  }

  public EntEstado updated(EntEstado entEstado) {
    entEstado.setData_updated_est(new Date());
    return reposEstado.saveAndFlush(entEstado);
  }

  public void delete(Long id) {
    EntEstado entEstado = reposEstado.findById(id).get();
    reposEstado.delete(entEstado);
  }
}
