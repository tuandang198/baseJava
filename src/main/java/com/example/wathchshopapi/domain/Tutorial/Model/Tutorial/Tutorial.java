package com.example.wathchshopapi.domain.Tutorial.Model.Tutorial;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Transient;

@Data
public class Tutorial {
    private Long id;

    private String name;

    private String hoTen;

    private String hoTen12;
}
