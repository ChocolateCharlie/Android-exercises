package com.example.topquiz.model;

import java.util.Collections;
import java.util.List;



public class QuestionBank {
    private List<Question> mQuestionList;
    private int mNextQuestionIndex;

/* Constructor
**  Shuffle the question list before storing it
*/
    public QuestionBank(List<Question> questionList) {
        mQuestionList = questionList;
        Collections.shuffle(mQuestionList);
        mNextQuestionIndex = 0;
    }

/* Loop over the questions and return a new one at each call */
    public Question getQuestion() {
        // Loop : at the end of the list, start again
        if (mNextQuestionIndex == mQuestionList.size()) {
            mNextQuestionIndex = 0;
        }
        // Return the current question and increment index
        return mQuestionList.get(mNextQuestionIndex++);
    }
}
