package com.example.spingaoprepository.service;

import com.example.spingaoprepository.repository.AllFileRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
@Data
public class PipelineService implements Serializable {
  private static final long serialVersionUID = 1L;

  @Autowired
  AllFileRepository allFileRepository;
}
