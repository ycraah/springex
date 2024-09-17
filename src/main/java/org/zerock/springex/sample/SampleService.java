package org.zerock.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;

@Service
@ToString
@RequiredArgsConstructor
public class SampleService {

  @Qualifier("normal")
  private final SampleDAO sampleDAO;

}
