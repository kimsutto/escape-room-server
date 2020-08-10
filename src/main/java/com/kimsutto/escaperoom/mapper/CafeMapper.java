package com.kimsutto.escaperoom.mapper;

import com.kimsutto.escaperoom.model.entity.CafeEntity;
import com.kimsutto.escaperoom.model.result.CafeResult;
import org.mapstruct.Mapper;

@Mapper(componentModel ="spring")
public interface CafeMapper extends EntityMapper<CafeResult, CafeEntity> {
 
}
