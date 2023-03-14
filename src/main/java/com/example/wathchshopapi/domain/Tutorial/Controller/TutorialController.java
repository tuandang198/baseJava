package com.example.wathchshopapi.domain.Tutorial.Controller;

import com.example.wathchshopapi.domain.Tutorial.Model.Tutorial.Tutorial;
import com.example.wathchshopapi.domain.Tutorial.Service.TutorialService;
import com.example.wathchshopapi.global.base.BaseSearchRequest;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class TutorialController {
    private final TutorialService service;

    @PostMapping("/tutorials")
    public ResponseEntity<PageImpl<Tutorial>> getAllTutorials(@RequestBody @Valid BaseSearchRequest request) {
        return ResponseEntity.ok(service.findAll(request));
    }
}
