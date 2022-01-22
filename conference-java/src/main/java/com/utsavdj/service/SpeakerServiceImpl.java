package com.utsavdj.service;

import com.utsavdj.model.Speaker;
import com.utsavdj.repository.HibernateSpeakerRepositoryImpl;
import com.utsavdj.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

  private SpeakerRepository repository;

  public SpeakerServiceImpl() {
    System.out.println("SpeakerServiceImpl no args constructor");
  }

  public SpeakerServiceImpl( SpeakerRepository repository ) {
    System.out.println("SpeakerServiceImpl repository constructor");
    this.repository = repository;
  }

  public List<Speaker> findAll() {
    return repository.findAll();
  }

  @Autowired
  public void setSpeakerRepository( SpeakerRepository repository ) {
    System.out.println("SpeakerServiceImpl setter");
    this.repository = repository;
  }
}
