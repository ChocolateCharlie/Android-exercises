package com.example.topquiz.model;

import java.util.List;



public class Question {
    private String mQuestion;
    private List<String> mChoicelist;
    private int mAnswerIndex;

/* Constructor */
    public Question(String mQuestion, List<String> mChoicelist, int mAnswerIndex) {
        this.mQuestion = mQuestion;
        this.mChoicelist = mChoicelist;
        this.mAnswerIndex = mAnswerIndex;
    }

/* Getters and Setters */
    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public List<String> getChoicelist() {
        return mChoicelist;
    }

    public void setChoicelist(List<String> mChoicelist) {
        this.mChoicelist = mChoicelist;
    }

    public int getAnswerIndex() {
        return mAnswerIndex;
    }

    public void setAnswerIndex(int mAnswerIndex) {
        this.mAnswerIndex = mAnswerIndex;
    }

}
