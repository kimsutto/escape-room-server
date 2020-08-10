package com.kimsutto.escaperoom.mapper;

import com.kimsutto.escaperoom.model.entity.ReviewEntity;
import com.kimsutto.escaperoom.model.result.ReviewResult;
import org.mapstruct.Mapper;

@Mapper(componentModel ="spring")

public interface ReviewMapper extends EntityMapper<ReviewResult, ReviewEntity> {

}
