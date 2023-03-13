package com.example.wathchshopapi.domain.Tutorial.Model.Base.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasePageableResponseDto {
    private Integer totalElements;
    private Integer pageBegin;
    private Integer pageEnd;
}
