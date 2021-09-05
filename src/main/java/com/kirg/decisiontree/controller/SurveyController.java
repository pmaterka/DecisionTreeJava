package com.kirg.decisiontree.controller;

import com.kirg.decisiontree.bean.Survey;
import com.kirg.decisiontree.service.SurveyQuestionService;
import com.kirg.decisiontree.service.SurveyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/survey")
public class SurveyController {

    private SurveyService surveyService;
    private SurveyQuestionService surveyQuestionService;

    public SurveyController(SurveyService surveyService, SurveyQuestionService surveyQuestionService) {
        this.surveyService = surveyService;
        this.surveyQuestionService = surveyQuestionService;
    }

    @GetMapping("/{id}")
    public Optional<Survey> get(@PathVariable long id) {
        return surveyService.get(id);
    }

    @GetMapping
    public List<Survey> getAll() {
        return surveyService.getAll();
    }

    @PostMapping
    public void save(@RequestBody Survey survey) {
        surveyService.save(survey);
        for (int i=0; i<survey.getSurveyQuestions().size();i++){
            surveyQuestionService.save(survey.getSurveyQuestions().get(i));
        }
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Survey survey, @PathVariable long id) {
        surveyService.update(survey, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        surveyService.delete(id);
    }
}
