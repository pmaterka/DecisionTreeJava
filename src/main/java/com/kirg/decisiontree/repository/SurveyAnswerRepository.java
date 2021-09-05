package com.kirg.decisiontree.repository;

import com.kirg.decisiontree.bean.SurveyAnswer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SurveyAnswerRepository {

    Optional<SurveyAnswer> get(long id);

    List<SurveyAnswer> getAll();

    void save(SurveyAnswer surveyAnswer);

    void update(SurveyAnswer surveyAnswer, long id);

    void delete(int id);
}
