package com.kimsutto.escaperoom.controller;

import com.kimsutto.escaperoom.service.CafeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@Api(value = "CafeController")
@RequestMapping("/api/cafe")
public class CafeController {
  private CafeService cafeService;

  @ApiOperation(value = "카페 전체 조회 ")
  @GetMapping(
      value = "",
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity get(){
    return ResponseEntity.ok(cafeService.getCafe());
  }

  @ApiOperation(value = "카페 이름, 지역 검색", notes="지역만 입력하고 싶을 때 : "
      + "http://220.149.235.230:8001/api/cafe/search?area=건대&name="
      + "\n"
      + "검색어만 입력하고 싶을 때 : "
      + "http://220.149.235.230:8001/api/cafe/search?name=솔버&area=")
  @GetMapping(
      value = "/search",
      produces = MediaType.APPLICATION_JSON_VALUE
  )

  public ResponseEntity get(@ApiParam(value = "카페 이름", required = false, example = "솔버") @RequestParam(value="name") String name, @ApiParam(value = "지역", required = false, example = "건대") @RequestParam(value="area") String area){

    return ResponseEntity.ok(cafeService.getCafe(name, area));
  }


  @ApiOperation(value = "카페 상세 정보 (테마 포함) ")
  @GetMapping(
      value = "/{id}",
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity get(@PathVariable("id") int id){
    return ResponseEntity.ok(cafeService.getCafe(id));
  }

  @ApiOperation(value = "근처 카페 매칭")
  @GetMapping(
      value="/map",
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity get(@RequestParam(value="lat") double lat, @RequestParam(value="lon") double lon){
    return ResponseEntity.ok(cafeService.getCafe(lat, lon));
  }

}
