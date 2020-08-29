package com.kimsutto.escaperoom.model.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int userId;

  private long token;
  private String provider;

  //uid와 provider정보로 회원종보 조회하는 메소드
  //Optional<UserEntity> findByUserIdAndProvider(int userid, String provider);
  //@RequestBody종류 provider, accessToken

}
