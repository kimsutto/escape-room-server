package com.kimsutto.escaperoom.model.param;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReviewParam {
  int userId;
  int themeId;
  Date escapedDate;
  String level;
  int escapedChk; // 0, 1
  int escapedTime;
  double rating;
  String description;
}
