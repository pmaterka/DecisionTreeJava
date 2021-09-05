package com.kirg.decisiontree.bean;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SurveyQuestion {

    private String theQuestion;

    private List<SurveyAnswer> surveyAnswerList= new ArrayList<>();

    public String getTheQuestion() {
        return theQuestion;
    }

    public void setTheQuestion(String theQuestion) {
        this.theQuestion = theQuestion;
    }

    public List<SurveyAnswer> getSurveyAnswerList() {
        return surveyAnswerList;
    }

    public void setSurveyAnswerList(List<SurveyAnswer> surveyAnswerList) {
        this.surveyAnswerList = surveyAnswerList;
    }
}
