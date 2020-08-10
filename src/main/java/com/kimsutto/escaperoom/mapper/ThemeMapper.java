package com.kimsutto.escaperoom.mapper;

import com.kimsutto.escaperoom.model.entity.ThemeEntity;
import com.kimsutto.escaperoom.model.result.ThemeResult;
import org.mapstruct.Mapper;

@Mapper(componentModel ="spring")
public interface ThemeMapper extends EntityMapper<ThemeResult, ThemeEntity> {

}