package com.kimsutto.escaperoom.model.result;


import java.sql.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReviewResult {
  //(테마 네임, 카페이름, 평점, 난이도, 성공여부, 날짜, 짧은후기)
  private int reviewId;

  private int userId;
  private int themeId;
  private String themeName; // U : themeid -> themename
  private String cafeName; // U : themeid -> cafename
  private Date escapedDate;
  private String level; // 쉬움 / 보통 /어려움
  private int escapedChk; //탈출 여부
  private int escapedTime; //탈출 시간
  private double rating;
  private String description;
}
