package com.kimsutto.escaperoom.model.repository;

import com.kimsutto.escaperoom.model.entity.ReviewEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewEntity, Integer> {

  @Query(value = "select * from review where theme_id = ?1", nativeQuery = true)
  List<ReviewEntity> findByTheme(int id);

  @Query(value = "select * from review where user_id = ?1", nativeQuery = true)
  List<ReviewEntity> findByUser(int id);





}
