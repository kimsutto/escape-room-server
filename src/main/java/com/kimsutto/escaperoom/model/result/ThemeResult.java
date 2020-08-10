package com.kimsutto.escaperoom.model.result;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ThemeResult {
  private int themeId;

  private String themeName;
  private String cafeName;
  private String area;
  private int genreId;
  private int price;
  private String pricePlus;
  private int level;
  private int time;
  private String activity;
  private int peopleNum;
  private String barrier;
  private double rating;
  private String image;
  private String description;
  private boolean liked;
  private List<ReviewResult> review;
}
