package com.example.wathchshopapi.domain.Tutorial.Repository;

import com.example.wathchshopapi.domain.Tutorial.Model.Tutorial.Tutorial;
import com.example.wathchshopapi.global.base.BaseSearchRequest;

import java.util.List;

public interface TutorialRepository {
    int save(Tutorial book);

    int update(Tutorial book);

    Tutorial findById(Long id);

    int deleteById(Long id);

    List<Tutorial> search(BaseSearchRequest request);

    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);

    int deleteAll();
}
