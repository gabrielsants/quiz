/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz.app.controllers;

import com.quiz.app.services.IQuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.quiz.app.entities.Quiz;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Gabriel Santos
 * @email gabriel_santos@discente.ufg.br
 */

@RestController
@RequestMapping("/api/quiz")
@CrossOrigin("*")
public class QuizController {
    
    @Autowired
    private IQuizService quizService;
    
    @GetMapping()
    public List<Quiz> findAll(){
        return this.quizService.getAll();
    }
}
