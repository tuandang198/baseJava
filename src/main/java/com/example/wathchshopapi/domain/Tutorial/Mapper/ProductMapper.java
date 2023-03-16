package com.example.wathchshopapi.domain.Tutorial.Mapper;

import com.example.wathchshopapi.domain.Tutorial.Model.Tutorial.Test;
import com.example.wathchshopapi.domain.Tutorial.Model.Tutorial.Tutorial;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(source = "id", target = "name")
    Test mapTest(Tutorial tutorial);
}
