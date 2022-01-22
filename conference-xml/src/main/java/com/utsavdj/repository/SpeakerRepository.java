package com.utsavdj.repository;

import com.utsavdj.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
  List<Speaker> findAll();
}
