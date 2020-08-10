package com.kimsutto.escaperoom.mapper;

public interface EntityMapper <R, E> {
  E toEntity(R result);
  R toResult(E entity);
}