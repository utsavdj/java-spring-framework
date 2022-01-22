package com.utsavdj.service;

import com.utsavdj.model.Speaker;
import com.utsavdj.repository.HibernateSpeakerRepositoryImpl;
import com.utsavdj.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

  private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

  public List<Speaker> findAll() {
    return repository.findAll();
  }
}
