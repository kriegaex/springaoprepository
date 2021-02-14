package com.example.spingaoprepository.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class AllFile implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;
  private String guid;
}
