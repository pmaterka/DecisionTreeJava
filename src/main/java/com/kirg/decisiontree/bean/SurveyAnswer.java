package com.kirg.decisiontree.bean;

import org.springframework.stereotype.Component;

@Component
public class SurveyAnswer {

    private String theAnswer;

    private String solutionToProblem;

    public String getTheAnswer() {
        return theAnswer;
    }

    public void setTheAnswer(String theAnswer) {
        this.theAnswer = theAnswer;
    }

    public String getSolutionToProblem() {
        return solutionToProblem;
    }

    public void setSolutionToProblem(String solutionToProblem) {
        this.solutionToProblem = solutionToProblem;
    }
}
