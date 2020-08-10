package com.kimsutto.escaperoom.controller;

import com.kimsutto.escaperoom.service.CafeService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/api/cafe")
public class CafeController {
  private CafeService cafeService;

  //카페 전체 조회
  @GetMapping(
      value = "",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity get(){
    return ResponseEntity.ok(cafeService.getCafe());
  }

  //카페 이름, 지역 필터 조회
  @GetMapping(
      value = "/search",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE
  )

  public ResponseEntity get(@RequestParam(value="name") String name, @RequestParam(value="area") String area){
    return ResponseEntity.ok(cafeService.getCafe(name, area));
  }


  //카페 상세 조회(+테마)
  @GetMapping(
      value = "/{id}",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity get(@PathVariable("id") int id){
    return ResponseEntity.ok(cafeService.getCafe(id));
  }

  //위치 받아서 근처 카페 매칭
  @GetMapping(
      value="/map",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity get(@RequestParam(value="lat") double lat, @RequestParam(value="lon") double lon){
    return ResponseEntity.ok(cafeService.getCafe(lat, lon));
  }

}
