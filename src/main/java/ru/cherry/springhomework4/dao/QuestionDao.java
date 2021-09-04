package ru.cherry.springhomework4.dao;

import ru.cherry.springhomework4.domain.Question;

import java.util.List;

public interface QuestionDao {
    List<Question> getQuestions();
}
