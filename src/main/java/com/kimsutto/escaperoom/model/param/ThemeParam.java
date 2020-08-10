package com.kimsutto.escaperoom.model.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ThemeParam {
  String themeName;
  String area;
  int genreId;
  int level;
  int time; // 4, 5, 6, 7, 8, 9
  String activity;
  int peopleNum;
  String barrier;
  String sorting; //  price, rating


}
