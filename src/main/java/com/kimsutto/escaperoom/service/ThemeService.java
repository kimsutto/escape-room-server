package com.kimsutto.escaperoom.service;

import com.kimsutto.escaperoom.mapper.ReviewMapper;
import com.kimsutto.escaperoom.mapper.ThemeMapper;
import com.kimsutto.escaperoom.model.entity.ReviewEntity;
import com.kimsutto.escaperoom.model.entity.ThemeEntity;
import com.kimsutto.escaperoom.model.param.ThemeParam;
import com.kimsutto.escaperoom.model.repository.ReviewRepository;
import com.kimsutto.escaperoom.model.repository.ThemeRepository;
import com.kimsutto.escaperoom.model.result.ReviewResult;
import com.kimsutto.escaperoom.model.result.ThemeResult;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class ThemeService {
  ThemeRepository themeRepository;
  ReviewRepository reviewRepository;
  ThemeMapper themeMapper;
  ReviewMapper reviewMapper;

  @Transactional
  public List<ThemeResult> getTheme(){
    List<ThemeEntity> entityList = themeRepository.findAll();
    List<ThemeResult> results = entityList.stream().map(themeEntity -> {
      ThemeResult themeResult = new ThemeResult();
      themeResult = themeMapper.toResult(themeEntity);
      boolean like = ( themeRepository.findLike(1,themeEntity.getThemeId()) == 0) ? false : true;
      themeResult.setLiked(like);
      return themeResult;
    }).collect(Collectors.toList());
    return results;
  }

  @Transactional
  public Object getTheme(int id){
    List<ReviewEntity> entityList = reviewRepository.findByTheme(id);
    System.out.println(entityList);
    List<ReviewResult> reviews = entityList.stream().map(reviewEntity -> {
      ReviewResult reviewResult = new ReviewResult();
      reviewResult = reviewMapper.toResult(reviewEntity);
      return reviewResult;
    }).collect(Collectors.toList());

    ThemeResult result = themeRepository.findById(id).map(themeEntity -> {
      ThemeResult themeResult = new ThemeResult();
      themeResult = themeMapper.toResult(themeEntity);
      boolean like = ( themeRepository.findLike(1,themeEntity.getThemeId()) == 0) ? false : true;
      themeResult.setLiked(like);
      themeResult.setReview(reviews);
      return themeResult;
    }).get();

    return result;
  }

  @Transactional
  public List<ThemeResult> getThemeFilter(ThemeParam param) {

    //테마명 추가
    int nonLevel = (param.getLevel()==0)? 0 : 5;
    int nonGenre = (param.getGenreId()==0)? 0 : 20;
    int nonTime = (param.getTime()==0)? 0 : 95;
    int nonPeople = (param.getPeopleNum()==0)? 0 : 3000;


    List<ThemeEntity> entityList = themeRepository.findThemeByFilter(param.getArea(), param.getGenreId(),param.getLevel(), param.getTime(), param.getActivity(), param.getPeopleNum(), param.getBarrier(), param.getSorting(), nonLevel, nonGenre, nonTime, nonPeople);
    List<ThemeResult> results = entityList.stream().map(themeEntity -> {
      ThemeResult themeResult = new ThemeResult();
      themeResult = themeMapper.toResult(themeEntity);
      boolean like = ( themeRepository.findLike(1,themeEntity.getThemeId()) == 0) ? false : true;
      themeResult.setLiked(like);
      return themeResult;
    }).collect(Collectors.toList());
    return results;
  }

  @Transactional
  public List<ThemeResult> getThemeWeek() {
    List<ThemeEntity> entityList = themeRepository.findThemeWeek();
    List<ThemeResult> results = entityList.stream().map(themeEntity -> {
      ThemeResult themeResult = new ThemeResult();
      themeResult = themeMapper.toResult(themeEntity);
      boolean like = ( themeRepository.findLike(1,themeEntity.getThemeId()) == 0) ? false : true;
      themeResult.setLiked(like);
      return themeResult;
    }).collect(Collectors.toList());
    return results;
  }

}
