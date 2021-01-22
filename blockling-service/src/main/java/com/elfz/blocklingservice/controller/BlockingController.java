package com.elfz.blocklingservice.controller;

import com.elfz.blocklingservice.domain.Tweet;
import java.util.List;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BlockingController {

  private static final String URI = "http://localhost:8080/tweets";

  @GetMapping("/blocking/tweets")
  public List<Tweet> getTweets() {

    var rest = new RestTemplate();
    var response =
        rest.exchange(URI, HttpMethod.GET, null, new ParameterizedTypeReference<List<Tweet>>() {});

    return response.getBody();
  }
}
