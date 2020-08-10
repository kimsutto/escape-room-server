package com.kimsutto.escaperoom.model.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@ToString
@Table(name = "theme")
public class ThemeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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
  private float rating;
  private String image;
  @Column(columnDefinition = "TEXT")
  private String description;

}