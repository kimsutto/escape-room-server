package com.kimsutto.escaperoom.model.result;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CafeResult {
  private int cafeId;

  private String cafeName;
  private String area;
  private String address;
  private double latitude;
  private double longitude;
  private String url;
  private String phoneNum;
  private String logo;
  private List<ThemeResult> themes;
}
