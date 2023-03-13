package com.example.wathchshopapi.domain.Tutorial.Service;

import com.example.wathchshopapi.domain.Tutorial.Model.Tutorial.Tutorial;
import com.example.wathchshopapi.domain.Tutorial.Repository.TutorialRepository;
import com.example.wathchshopapi.global.base.BaseSearchRequest;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TutorialServiceImpl implements TutorialService {
    private final TutorialRepository tutorialRepository;

    @Override
    public PageImpl<Tutorial> findAll(BaseSearchRequest request) {

        List<Tutorial> tutorials = new ArrayList<>(tutorialRepository.search(request));
        return new PageImpl<>(tutorials, PageRequest.of(0, 10), tutorials.size());
    }
}
