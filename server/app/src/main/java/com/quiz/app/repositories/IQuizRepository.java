/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz.app.repositories;

import com.quiz.app.entities.Quiz;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author Gabriel Santos
 * @email gabriel_santos@discente.ufg.br
 */

@Repository
public interface IQuizRepository extends JpaRepository<Quiz, Long> {
    
    @Query(value="SELECT * FROM quizapp ORDER BY RAND()", nativeQuery = true)
    public List<Quiz> getAll();
}
