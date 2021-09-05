package com.kirg.decisiontree.service;

import com.kirg.decisiontree.bean.SurveyQuestion;
import com.kirg.decisiontree.repository.SurveyQuestionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SurveyQuestionService implements SurveyQuestionRepository{

    private List<SurveyQuestion> surveyQuestionList = new ArrayList<>();

    @Override
    public Optional<SurveyQuestion> get(long id) {

        return Optional.ofNullable(surveyQuestionList.get((int)id));
    }

    @Override
    public List<SurveyQuestion> getAll() {

        return surveyQuestionList;
    }

    @Override
    public void save(SurveyQuestion surveyQuestion) {

        surveyQuestionList.add(surveyQuestion);
    }

    @Override
    public void update(SurveyQuestion surveyQuestion, long id) {

        surveyQuestionList.get((int)id).setSurveyAnswerList(surveyQuestion.getSurveyAnswerList());
        surveyQuestionList.get((int)id).setTheQuestion(surveyQuestion.getTheQuestion());
    }

    @Override
    public void delete(long id) {

        surveyQuestionList.remove(id);
    }
}
