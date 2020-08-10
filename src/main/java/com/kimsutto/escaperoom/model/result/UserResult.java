package com.kimsutto.escaperoom.model.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserResult {

  private int userId;
  private int reviewCount;
  private int likeCount;

}