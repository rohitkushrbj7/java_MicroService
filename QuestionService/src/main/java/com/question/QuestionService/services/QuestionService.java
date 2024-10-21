package com.question.QuestionService.services;

import com.question.QuestionService.entities.Question;
import java.util.List;

// This should be an interface, not a class
public interface QuestionService {

    // Declare methods that will be implemented by the service class
    Question create(Question question);

    List<Question> get();

    Question getOne(Long id);

    List<Question>getQuestionsOfQuiz(Long quizId);
}
