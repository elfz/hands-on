package com.elfz.slowservice.service;

import com.elfz.slowservice.domain.Tweet;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SlowService {

  public List<Tweet> getTweets() {

    return Arrays.asList(
        buildTweet("First Tweet", "@user1"),
        buildTweet("Second Tweet", "@user2"),
        buildTweet("Third Tweet", "@user3"));
  }

  private Tweet buildTweet(String message, String user) {
    return Tweet.builder().message(message).user(user).build();
  }


}
