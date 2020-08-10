package com.kimsutto.escaperoom.model.repository;

import com.kimsutto.escaperoom.model.entity.CafeEntity;
import com.kimsutto.escaperoom.model.entity.ThemeEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeRepository extends JpaRepository<ThemeEntity, Integer> {
  @Query(value = "select * from theme where theme_id in (select theme_id from cafe_theme where cafe_id = ?1)", nativeQuery = true)
  List<ThemeEntity> findThemesByCafe(int id);

  @Query(value = "select * from theme where theme_id in (1,7,11,15,40)", nativeQuery = true)
  List<ThemeEntity> findThemeWeek();


  @Query(value = "select * from theme where area like %?1% AND (genre_id = ?2 or genre_id > ?10) AND (level = ?3 or level > ?9)" +
      "AND (time like ?4% or time > ?11) AND activity like %?5% AND (people_num like %?6% or people_num > ?12) AND barrier like %?7% order by ?8", nativeQuery = true)
  List<ThemeEntity> findThemeByFilter(String area, int genreId, int level, int time, String activity, int people_num, String barrier, String order , int nonlevel, int nonGenre, int nonTime, int nonPeople);

  @Query(value = "select EXISTS (select * from theme_like where user_id =?1 AND theme_id=?2 ) as success", nativeQuery = true)
  int findLike(int userId, int themeId);

  @Modifying
  @Query(value = "update theme SET rating = (rating + ?1) / ((select count(*) from review where theme_id = ?2) +1) where theme_id = ?2", nativeQuery = true)
  void updateRating(double rating, int themeId);



}
