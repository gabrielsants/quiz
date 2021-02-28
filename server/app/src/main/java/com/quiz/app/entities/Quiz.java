/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Gabriel Santos
 * @email gabriel_santos@discente.ufg.br
 */

@Entity
public class Quiz {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String question;
    
    private String affirmation1;
    
    private String affirmation2;
    
    private String affirmation3;
    
    private int answer;

    public Quiz() { }

    public Quiz(Long id, String question, String affirmation1, String affirmation2, String affirmation3, int answer) {
        this.id = id;
        this.question = question;
        this.affirmation1 = affirmation1;
        this.affirmation2 = affirmation2;
        this.affirmation3 = affirmation3;
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAffirmation1() {
        return affirmation1;
    }

    public void setAffirmation1(String affirmation1) {
        this.affirmation1 = affirmation1;
    }

    public String getAffirmation2() {
        return affirmation2;
    }

    public void setAffirmation2(String affirmation2) {
        this.affirmation2 = affirmation2;
    }

    public String getAffirmation3() {
        return affirmation3;
    }

    public void setAffirmation3(String affirmation3) {
        this.affirmation3 = affirmation3;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Quiz{" + "id=" + id + ", question=" + question + ", affirmation1=" + affirmation1 + ", affirmation2=" + affirmation2 + ", affirmation3=" + affirmation3 + ", answer=" + answer + '}';
    }
    
}
