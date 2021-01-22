package com.elfz.slowservice.controller;

import com.elfz.slowservice.domain.Tweet;
import com.elfz.slowservice.service.SlowService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SlowController {

  private final SlowService slowService;

  @GetMapping("/tweets")
  public List<Tweet> getTweets() throws InterruptedException {
    return slowService.getTweets();
  }


}
