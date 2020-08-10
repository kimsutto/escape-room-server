package com.kimsutto.escaperoom.service;

import com.kimsutto.escaperoom.mapper.ReviewMapper;
import com.kimsutto.escaperoom.mapper.ThemeMapper;
import com.kimsutto.escaperoom.model.entity.ReviewEntity;
import com.kimsutto.escaperoom.model.entity.ThemeEntity;
import com.kimsutto.escaperoom.model.param.LoginParam;
import com.kimsutto.escaperoom.model.repository.ReviewRepository;
import com.kimsutto.escaperoom.model.repository.ThemeRepository;
import com.kimsutto.escaperoom.model.repository.UserRepository;
import com.kimsutto.escaperoom.model.result.ReviewResult;
import com.kimsutto.escaperoom.model.result.ThemeResult;
import com.kimsutto.escaperoom.model.result.UserResult;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class UserService {
  ThemeRepository themeRepository;
  ReviewRepository reviewRepository;
  UserRepository userRepository;
  ThemeMapper themeMapper;
  ReviewMapper reviewMapper;

  @Transactional
  public void login(LoginParam param){

  }

  @Transactional
  public Object getUser(int id){
    UserResult result = new UserResult();
    result.setUserId(id);
    result.setReviewCount(userRepository.findReviewCount(id));
    result.setLikeCount(userRepository.findLikeCount(id));

    return result;
  }

  @Transactional
  public void like(int theme, int user){
    if ((themeRepository.findLike(user, theme) > 0)) {
      userRepository.updateUnLike(user, theme);
    } else {
      userRepository.updateLike(user, theme);
    }
  }

  @Transactional
  public Object getReview(int id){
    List<ReviewEntity> entityList =  reviewRepository.findByUser(id);
    System.out.println(entityList);
    List<ReviewResult> results = entityList.stream().map(reviewEntity -> {
      ReviewResult reviewResult = new ReviewResult();
      reviewResult = reviewMapper.toResult(reviewEntity);
      int themeId = reviewEntity.getThemeId();
      reviewResult.setThemeName(themeRepository.findThemeNameByThemeId(id));
      reviewResult.setCafeName(themeRepository.findCafeNameByThemeId(id));

      return reviewResult;
    }).collect(Collectors.toList());

    return results;
  }

  @Transactional
  public Object getTheme(int id){
    List<ThemeEntity> entityList = themeRepository.findThemeByUser(id);
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
