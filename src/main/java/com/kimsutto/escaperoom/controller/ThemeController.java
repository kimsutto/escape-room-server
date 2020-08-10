package com.kimsutto.escaperoom.controller;
import com.kimsutto.escaperoom.model.param.ThemeParam;
import com.kimsutto.escaperoom.service.ThemeService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/api/theme")
public class ThemeController {
  private ThemeService themeService;

  @ApiOperation(value = "테마 전체 조회")
  @GetMapping(
      value = "",
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  //페이징
  //public String get(@RequestParam(value="start",defaultValue="1") Integer PageNum) {
  //Integer[] pageList = themeService.getTheme(pageNum);
  public ResponseEntity get(){
    return ResponseEntity.ok(themeService.getTheme());
  }

  @ApiOperation(value = "테마 필터링 조회")
  @PostMapping(
      value = "",
      consumes = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity getFilter(@RequestBody ThemeParam param){
    return ResponseEntity.ok(themeService.getThemeFilter(param));
  }

  @ApiOperation(value = "테마 상세 정보 (리뷰 포함) ")
  @GetMapping(
      value = "/{id}",
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity get(@PathVariable("id") int id){
    return ResponseEntity.ok(themeService.getTheme(id));
  }


  @ApiOperation(value = "금주의 테마")
  @GetMapping(
      value ="/week",
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity getWeek(){
    return ResponseEntity.ok(themeService.getThemeWeek());
  }



}
