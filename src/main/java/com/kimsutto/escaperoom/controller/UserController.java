package com.kimsutto.escaperoom.controller;

import com.kimsutto.escaperoom.model.param.LoginParam;
import com.kimsutto.escaperoom.service.ThemeService;
import com.kimsutto.escaperoom.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
public class UserController {

  UserService userService;

  //로그인
  @PostMapping(
      value = "api/login",
      consumes = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity login(@RequestBody LoginParam param ){
    userService.login(param);
    return ResponseEntity.ok("로그인 성공");
  }

  @ApiOperation(value = "사용자가 정보 조회")
  @GetMapping(
      value = "api/user/{id}",
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity get(@PathVariable("id") int id ) {
    return ResponseEntity.ok(userService.getUser(id));
  }

  @ApiOperation(value = "테마 찜 등록 / 취소 ")
  @GetMapping(
      value = "api/user/like"
  )
  public ResponseEntity like(@RequestParam(value="theme") int theme, @RequestParam(value="user") int user) {
    userService.like(theme, user);
    return ResponseEntity.ok("");
  }

  @ApiOperation(value = "사용자가 작성한 리뷰 조회")
  @GetMapping(
      value = "api/user/{id}/review",
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity getReview(@PathVariable("id") int id){
    return ResponseEntity.ok(userService.getReview(id));
  }

  @ApiOperation(value = "사용자가 찜한 테마 조회")
  @GetMapping(
      value = "api/user/{id}/theme",
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity getTheme(@PathVariable("id") int id){
    return ResponseEntity.ok(userService.getTheme(id));
  }

}
