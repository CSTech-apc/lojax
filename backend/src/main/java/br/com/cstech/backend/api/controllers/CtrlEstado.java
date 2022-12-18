package br.com.cstech.backend.api.controllers;

import br.com.cstech.backend.domain.entities.EntEstado;
import br.com.cstech.backend.domain.services.ServEstado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/estados")
public class CtrlEstado {

  @Autowired
  private ServEstado servEstado;

  @GetMapping(path = "/read-all")
  public List<EntEstado> readAll() {
    return servEstado.readAll();
  }

  @PostMapping(path = "/created")
  public EntEstado created(@RequestBody EntEstado entEstado) {
    return servEstado.created(entEstado);
  }

  @PutMapping(path = "/updated")
  public EntEstado updated(@RequestBody EntEstado entEstado) {
    return servEstado.updated(entEstado);
  }

  @DeleteMapping(path = "/delete/{id}")
  public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
    servEstado.delete(id);
    return ResponseEntity.status(HttpStatus.OK).build();
  }
}
