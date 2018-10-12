/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.model;


import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Fred Hicken
 */
public class Question implements Serializable {
    //private instances
    //the string containing the question iteself
    private String questionText;
    //string for possible answer one
    private String answerOne;
    //string for possible answer two
    private String answerTwo;
    //string for possible answer three
    private String answerThree;
    //string for possible answer four
    private String answerFour;
    //int defining the correct answer if there is one
    private int correctAnswer;
    
    //Constructors

    public Question() {
    }
    
    // getters & setters

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public void setAnswerOne(String answerOne) {
        this.answerOne = answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public void setAnswerTwo(String answerTwo) {
        this.answerTwo = answerTwo;
    }

    public String getAnswerThree() {
        return answerThree;
    }

    public void setAnswerThree(String answerThree) {
        this.answerThree = answerThree;
    }

    public String getAnswerFour() {
        return answerFour;
    }

    public void setAnswerFour(String answerFour) {
        this.answerFour = answerFour;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    
    //hash, equals, and toString

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.questionText);
        hash = 67 * hash + Objects.hashCode(this.answerOne);
        hash = 67 * hash + Objects.hashCode(this.answerTwo);
        hash = 67 * hash + Objects.hashCode(this.answerThree);
        hash = 67 * hash + Objects.hashCode(this.answerFour);
        hash = 67 * hash + this.correctAnswer;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (this.correctAnswer != other.correctAnswer) {
            return false;
        }
        if (!Objects.equals(this.questionText, other.questionText)) {
            return false;
        }
        if (!Objects.equals(this.answerOne, other.answerOne)) {
            return false;
        }
        if (!Objects.equals(this.answerTwo, other.answerTwo)) {
            return false;
        }
        if (!Objects.equals(this.answerThree, other.answerThree)) {
            return false;
        }
        if (!Objects.equals(this.answerFour, other.answerFour)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "questionText=" + questionText + ", answerOne=" + answerOne + ", answerTwo=" + answerTwo + ", answerThree=" + answerThree + ", answerFour=" + answerFour + ", correctAnswer=" + correctAnswer + '}';
    }
    
    
    
}
