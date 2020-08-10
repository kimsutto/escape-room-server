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

  @ApiOperation(value = "리뷰 작성")
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
