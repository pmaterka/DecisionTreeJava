package com.kirg.decisiontree.service;

import com.kirg.decisiontree.bean.SurveyAnswer;
import com.kirg.decisiontree.repository.SurveyAnswerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SurveyAnswerService implements SurveyAnswerRepository{

    private List<SurveyAnswer> surveyAnswerList = new ArrayList<>();


    @Override
    public Optional<SurveyAnswer> get(long id) {

        return Optional.ofNullable(surveyAnswerList.get((int)id));
    }

    @Override
    public List<SurveyAnswer> getAll() {
        return surveyAnswerList;
    }

    @Override
    public void save(SurveyAnswer surveyAnswer) {
        surveyAnswerList.add(surveyAnswer);
    }

    @Override
    public void update(SurveyAnswer surveyAnswer, long id) {
        surveyAnswerList.get((int)id).setTheAnswer(surveyAnswer.getTheAnswer());
        surveyAnswerList.get((int)id).setSolutionToProblem(surveyAnswer.getSolutionToProblem());
    }

    @Override
    public void delete(int id) {
        surveyAnswerList.remove(id);
    }


}
