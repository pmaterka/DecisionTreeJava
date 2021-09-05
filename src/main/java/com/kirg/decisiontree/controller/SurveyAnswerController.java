package com.kirg.decisiontree.controller;

import com.kirg.decisiontree.bean.SurveyAnswer;
import com.kirg.decisiontree.service.SurveyAnswerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/surveyAnswer")
public class SurveyAnswerController {
    private SurveyAnswerService surveyAnswerService;

    public SurveyAnswerController(SurveyAnswerService surveyAnswerService) {
        this.surveyAnswerService = surveyAnswerService;
    }

    @GetMapping
    public List<SurveyAnswer> getAll(){
        return surveyAnswerService.getAll();
    }

    @PostMapping
    public void addSurveyAnswer(@RequestBody SurveyAnswer surveyAnswer){
        surveyAnswerService.save(surveyAnswer);


    }

    @PutMapping("/{id}")
    public void updateSurveyAnswer (@RequestBody SurveyAnswer surveyAnswer, @PathVariable long id){
        surveyAnswerService.update(surveyAnswer,id);
    }

    @GetMapping("/{id}")
    public Optional<SurveyAnswer> getOneAnswer(@PathVariable long id) {
        return surveyAnswerService.get(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAnswer(@PathVariable int id) {
        surveyAnswerService.delete(id);
    }
}
