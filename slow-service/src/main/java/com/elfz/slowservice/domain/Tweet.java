package com.elfz.slowservice.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tweet {

  private String message;
  private String user;

}
