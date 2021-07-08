package com.sandon.multi.api.data;


import com.sandon.multi.api.domain.Dummy;
import com.sandon.multi.api.domain.DummyRepository;
import javax.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class CreateDummyData {

  private final DummyRepository dummyRepository;

  public Dummy create(Dummy dummy) {
    return dummyRepository.save(dummy);
  }
}
