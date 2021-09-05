package com.kirg.decisiontree.repository;

import com.kirg.decisiontree.bean.Survey;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SurveyRepository {

    Optional<Survey> get(long id);

    List<Survey> getAll();

    void save(Survey survey);

    void update(Survey survey, long id);

    void delete(long id);



}
