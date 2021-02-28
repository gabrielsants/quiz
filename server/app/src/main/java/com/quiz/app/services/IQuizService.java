/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz.app.services;

import com.quiz.app.entities.Quiz;
import java.util.List;

/**
 * @author Gabriel Santos
 * @email gabriel_santos@discente.ufg.br
 */

public interface IQuizService {
    
    public List<Quiz> getAll();
}
