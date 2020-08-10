package com.kimsutto.escaperoom.service;

import com.kimsutto.escaperoom.mapper.CafeMapper;
import com.kimsutto.escaperoom.mapper.ThemeMapper;
import com.kimsutto.escaperoom.model.entity.CafeEntity;
import com.kimsutto.escaperoom.model.entity.ThemeEntity;
import com.kimsutto.escaperoom.model.param.ThemeParam;
import com.kimsutto.escaperoom.model.repository.CafeRepository;
import com.kimsutto.escaperoom.model.repository.ThemeRepository;
import com.kimsutto.escaperoom.model.result.CafeResult;
import com.kimsutto.escaperoom.model.result.ThemeResult;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class CafeService {

  CafeRepository cafeRepository;
  ThemeRepository themeRepository;
  CafeMapper cafeMappper;
  ThemeMapper themeMapper;


  @Transactional
  public List<CafeResult> getCafe(){
    List<CafeEntity> entityList = cafeRepository.findAll();
    List<CafeResult> results = entityList.stream().map(cafeEntity -> {
          CafeResult cafeResult = new CafeResult();
          cafeResult = cafeMappper.toResult(cafeEntity);
          return cafeResult;
        }).collect(Collectors.toList());
    return results;
  }


  @Transactional
  public List<CafeResult> getCafe(String name, String area){
    List<CafeEntity> entityList = cafeRepository.findByCafeNameAndArea(name, area);
    List<CafeResult> results = entityList.stream().map(cafeEntity -> {
      CafeResult cafeResult = new CafeResult();
      cafeResult = cafeMappper.toResult(cafeEntity);
      return cafeResult;
    }).collect(Collectors.toList());
    return results;
  }


  @Transactional
  public Object getCafe(int id){
    List<ThemeEntity> entityList = themeRepository.findThemesByCafe(id);
    System.out.println(entityList);
    List<ThemeResult> themes = entityList.stream().map(themeEntity -> {
      ThemeResult themeResult = new ThemeResult();
      themeResult = themeMapper.toResult(themeEntity);
      return themeResult;
    }).collect(Collectors.toList());

    CafeResult result = cafeRepository.findById(id).map(cafeEntity -> {
      CafeResult cafeResult = new CafeResult();
      cafeResult = cafeMappper.toResult(cafeEntity);
      cafeResult.setThemes(themes);
      return cafeResult;
    }).get();

    return result;
  }

  @Transactional
  public List<CafeResult> getCafe(double lat, double lon){
    List<CafeEntity> entityList = cafeRepository.findByLatAndLon(lat, lon);
    List<CafeResult> results = entityList.stream().map(cafeEntity -> {
      CafeResult cafeResult = new CafeResult();
      cafeResult = cafeMappper.toResult(cafeEntity);
      return cafeResult;
    }).collect(Collectors.toList());
    return results;
  }

}
