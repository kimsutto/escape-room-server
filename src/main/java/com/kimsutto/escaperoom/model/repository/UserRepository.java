package com.kimsutto.escaperoom.model.repository;

import com.kimsutto.escaperoom.model.entity.CafeEntity;
import com.kimsutto.escaperoom.model.entity.ThemeEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository  extends JpaRepository<ThemeEntity, Integer> {
  @Query(value = "select count(*) from review where user_id = ?1", nativeQuery = true)
  int findReviewCount(int id);

  @Query(value = "select count(*) from theme_like where user_id = ?1",nativeQuery = true)
  int findLikeCount(int id);

  @Modifying
  @Query(value = "insert into theme_like values(?1, ?2)", nativeQuery = true)
  void updateLike(int user, int theme);

  @Modifying
  @Query(value = "delete from theme_like where user_id = ?1 AND theme_id = ?2", nativeQuery = true)
  void updateUnLike(int user, int theme);


}
