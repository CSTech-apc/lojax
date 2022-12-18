package br.com.cstech.backend.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "estados")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EntEstado {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @EqualsAndHashCode.Include
  private Long pk_est;

  private String nome_est;

  private String sigla_est;

  @Temporal(TemporalType.TIMESTAMP)
  private Date data_created_est;

  @Temporal(TemporalType.TIMESTAMP)
  private Date data_updated_est;
}
