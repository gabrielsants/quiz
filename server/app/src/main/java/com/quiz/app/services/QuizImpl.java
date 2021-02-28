/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz.app.services;

import com.quiz.app.entities.Quiz;
import com.quiz.app.repositories.IQuizRepository;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
/**
 * @author Gabriel Santos
 * @email gabriel_santos@discente.ufg.br
 */

@Service
public class QuizImpl implements IQuizService {
    
    @Autowired
    private IQuizRepository quizRepository;

    @Override
    public List<Quiz> getAll() {
        return this.quizRepository.getAll();
    }
}
