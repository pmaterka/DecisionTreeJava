package com.kirg.decisiontree.bean;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component

public class Survey {

    private List<SurveyQuestion> surveyQuestions = new ArrayList<>();

    public List<SurveyQuestion> getSurveyQuestions() {
        return surveyQuestions;
    }

    public void setSurveyQuestions(List<SurveyQuestion> surveyQuestions) {
        this.surveyQuestions = surveyQuestions;

    }





}
