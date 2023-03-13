package com.example.wathchshopapi.domain.Tutorial.Service;

import com.example.wathchshopapi.domain.Tutorial.Model.Tutorial.Tutorial;
import com.example.wathchshopapi.global.base.BaseSearchRequest;
import org.springframework.data.domain.PageImpl;

public interface TutorialService {
    PageImpl<Tutorial> findAll(BaseSearchRequest request);
}
