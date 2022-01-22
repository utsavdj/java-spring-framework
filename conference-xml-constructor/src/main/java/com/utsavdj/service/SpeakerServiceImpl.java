package com.utsavdj.service;

import com.utsavdj.model.Speaker;
import com.utsavdj.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

  private SpeakerRepository repository;

  public SpeakerServiceImpl() {

  }

  public SpeakerServiceImpl( SpeakerRepository repository ) {
    this.repository = repository;
  }

  public List<Speaker> findAll() {
    return repository.findAll();
  }

//  public void setCurrentSpeakerRepository( SpeakerRepository repository ) {
//    this.repository = repository;
//  }
}
