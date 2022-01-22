package com.utsavdj.repository;

import com.utsavdj.model.Speaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
  @Value("#{ T(java.lang.Math).random() * 100 }")
  private double seedNum;

  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<Speaker>();

    Speaker speaker = new Speaker();
    speaker.setFirstName("Utsav");
    speaker.setLastName("Joshi");

    speaker.setSeedNum(seedNum);

    speakers.add(speaker);

    return speakers;
  }
}
