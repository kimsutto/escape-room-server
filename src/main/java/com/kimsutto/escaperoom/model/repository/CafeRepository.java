package com.kimsutto.escaperoom.model.repository;

import com.kimsutto.escaperoom.model.entity.CafeEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CafeRepository extends JpaRepository<CafeEntity, Integer> {
  @Query(value = "select * from cafe where cafe_name like %?1% and area like %?2% ", nativeQuery = true)
  List<CafeEntity> findByCafeNameAndArea(String CafeName, String area);

  @Query(value = "SELECT *, (6371*acos(cos(radians(?1))*cos(radians(latitude))*cos(radians(longitude) - radians(?2))+sin(radians(?1))*sin(radians(latitude)))) AS distance FROM cafe HAVING distance <= 30 ORDER BY distance  LIMIT 6", nativeQuery = true)
  List<CafeEntity> findByLatAndLon(double lat, double lon);
}
