package com.kimsutto.escaperoom.model.entity;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "cafe")
public class CafeEntity {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int cafeId;

  private String cafeName;
  private String area;
  private String address;
  private double latitude;
  private double longitude;
  private String url;
  private String phoneNum;
  private String logo;

}
