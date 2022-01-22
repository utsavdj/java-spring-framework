package com.utsavdj.repository;

import com.utsavdj.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<Speaker>();

    Speaker speaker = new Speaker();
    speaker.setFirstName("Utsav");
    speaker.setLastName("Joshi");
    speakers.add(speaker);

    return speakers;
  }
}
