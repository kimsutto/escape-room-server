package com.kimsutto.escaperoom.service;

import com.kimsutto.escaperoom.mapper.ReviewMapper;
import com.kimsutto.escaperoom.model.entity.ReviewEntity;
import com.kimsutto.escaperoom.model.param.ReviewParam;
import com.kimsutto.escaperoom.model.repository.ReviewRepository;
import com.kimsutto.escaperoom.model.repository.ThemeRepository;
import com.kimsutto.escaperoom.model.result.ReviewResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class ReviewService {
  ReviewRepository reviewRepository;
  ReviewMapper reviewMapper;
  ThemeRepository themeRepository;

  @Transactional
  public void add(ReviewResult param) {
    ReviewEntity entity = new ReviewEntity();
    entity = reviewMapper.toEntity(param);
    System.out.println(entity);
    //entity.setUser_id(param.getUserId());

    themeRepository.updateRating(param.getRating(), param.getThemeId());
    reviewRepository.save(entity);
  }

}
