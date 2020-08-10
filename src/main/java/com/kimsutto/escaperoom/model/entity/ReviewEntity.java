package com.kimsutto.escaperoom.model.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@ToString
@Table(name = "review")
public class ReviewEntity {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int reviewId;

  @Column(nullable = false)
  private int userId;

  @Column(nullable = false)
  private int themeId;

  private Date escapedDate;

  @Column(nullable = false)
  private String level;

  @Column(nullable = false)
  private int escapedChk;

  @Column(nullable = false)
  private int escapedTime;

  @Column(nullable = false)
  private float rating;

  @Column(columnDefinition = "TEXT", nullable = false)
  private String description;
}
