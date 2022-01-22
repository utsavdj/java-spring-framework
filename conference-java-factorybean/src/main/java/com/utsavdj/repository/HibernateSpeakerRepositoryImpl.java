package com.utsavdj.repository;

import com.utsavdj.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
  @Autowired
  private Calendar cal;

  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<Speaker>();

    Speaker speaker = new Speaker();
    speaker.setFirstName("Utsav");
    speaker.setLastName("Joshi");

    System.out.println("cal: " + cal.getTime());

    speakers.add(speaker);

    return speakers;
  }
}
