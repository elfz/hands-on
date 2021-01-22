package com.elfz.reactiveservice.controller;

import com.elfz.reactiveservice.domain.Tweet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@RestController
public class ReactiveController {

  private static final String URI = "http://localhost:8080/tweets";

  @GetMapping("/reactive/tweets")
  public Flux<Tweet> getTweets(){
    return WebClient.create()
        .get()
        .uri(URI)
        .retrieve()
        .bodyToFlux(Tweet.class);
  }

}
