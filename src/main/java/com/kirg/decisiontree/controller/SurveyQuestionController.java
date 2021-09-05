package com.kirg.decisiontree.controller;

import com.kirg.decisiontree.bean.SurveyQuestion;
import com.kirg.decisiontree.service.SurveyQuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/surveyquestion")
public class SurveyQuestionController {
    private SurveyQuestionService surveyQuestionService;

    public SurveyQuestionController(SurveyQuestionService surveyQuestionService) {
        this.surveyQuestionService = surveyQuestionService;
    }

    @GetMapping("/{id}")
    public Optional<SurveyQuestion> get(@PathVariable long id) {
        return surveyQuestionService.get(id);
    }

    @GetMapping
    public List<SurveyQuestion> getAll() {
        return surveyQuestionService.getAll();
    }

    @PostMapping
    public void save(@RequestBody SurveyQuestion surveyQuestion) {
        surveyQuestionService.save(surveyQuestion);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody SurveyQuestion surveyQuestion, @PathVariable long id) {
        surveyQuestionService.update(surveyQuestion, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        surveyQuestionService.delete(id);
    }
}
