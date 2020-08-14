package com.kimsutto.escaperoom.controller;

import com.kimsutto.escaperoom.model.param.ReviewParam;
import com.kimsutto.escaperoom.model.result.ReviewResult;
import com.kimsutto.escaperoom.service.ReviewService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
public class ReviewController {
  private ReviewService reviewService;

  @ApiOperation(value = "리뷰 작성", notes ="{\n"
      + "    \"userId\" : 1,\n"
      + "    \"themeId\" : 1,\n"
      + "    \"escapedDate\" : \"2020-08-05\",\n"
      + "    \"level\" : \"쉬움\",\n"
      + "    \"escapedChk\" : 1, // 0 : 탈출 실패, 1: 탈출 성공\n"
      + "    \"escapedTime\" : 40,\n"
      + "    \"rating\" : 3.0,\n"
      + "    \"description\" : \"재밌음\"\n"
      + "}"
      + "\n 이 외엔 생략해서 보내주세요")
  @PostMapping(
      value = "/api/review",
      consumes = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity add(@RequestBody ReviewResult param){
    reviewService.add(param);
    return ResponseEntity.ok("리뷰 등록 완료");
  }

  //테마 별 리뷰 조회, 유저 별 리뷰 조회 이쪽으로 옮기기

}
