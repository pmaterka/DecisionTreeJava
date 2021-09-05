package com.kirg.decisiontree.repository;

import com.kirg.decisiontree.bean.SurveyQuestion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SurveyQuestionRepository  {
    Optional<SurveyQuestion> get(long id);

    List<SurveyQuestion> getAll();

    void save(SurveyQuestion surveyQuestion);

    void update(SurveyQuestion surveyQuestion, long id);

    void delete(long id);
}
