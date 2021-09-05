package com.kirg.decisiontree.service;

import com.kirg.decisiontree.bean.Survey;
import com.kirg.decisiontree.repository.SurveyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SurveyService implements SurveyRepository {

    private List<Survey> surveyList = new ArrayList<>();


    @Override
    public Optional<Survey> get(long id) {

        return Optional.ofNullable(surveyList.get((int)id));
    }

    @Override
    public List<Survey> getAll() {

        return surveyList;
    }

    @Override
    public void save(Survey survey) {

        surveyList.add(survey);
    }

    @Override
    public void update(Survey survey, long id) {

        surveyList.get((int)id).setSurveyQuestions(survey.getSurveyQuestions());
    }

    @Override
    public void delete(long id) {

        surveyList.remove((int)id);

    }
}
