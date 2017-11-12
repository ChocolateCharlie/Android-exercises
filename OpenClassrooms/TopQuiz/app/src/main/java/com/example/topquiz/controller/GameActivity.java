package com.example.topquiz.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.topquiz.R;
import com.example.topquiz.model.Question;
import com.example.topquiz.model.QuestionBank;

import java.util.Arrays;



public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    private QuestionBank mQuestionBank;
    private Question mCurrentQuestion;
    private TextView mQuestionText;
    private Button mAnswer1;
    private Button mAnswer2;
    private Button mAnswer3;
    private Button mAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mQuestionBank = this.generateQuestions();
        mCurrentQuestion = mQuestionBank.getQuestion();

        mQuestionText = (TextView) findViewById(R.id.activity_game_question_text);
        mAnswer1 = (Button) findViewById(R.id.activity_game_answer1_btn);
        mAnswer1.setOnClickListener(this);
        mAnswer1.setTag(0);
        mAnswer2 = (Button) findViewById(R.id.activity_game_answer2_btn);
        mAnswer2.setOnClickListener(this);
        mAnswer1.setTag(1);
        mAnswer3 = (Button) findViewById(R.id.activity_game_answer3_btn);
        mAnswer3.setOnClickListener(this);
        mAnswer1.setTag(2);
        mAnswer4 = (Button) findViewById(R.id.activity_game_answer4_btn);
        mAnswer4.setOnClickListener(this);
        mAnswer1.setTag(3);

        this.displayQuestion(mCurrentQuestion);
    }

/* Initialise questions and return a questionbank */
    protected QuestionBank generateQuestions() {
        // Create questions
        Question question1 = new Question("Who is the creator of Android ?",
                                            Arrays.asList("Andy Rubin", "Steve Wozniak", "Jake Wharton", "Paul Smith"),
                                            0);
        Question question2 = new Question("When did the first man land on the moon ?",
                                            Arrays.asList("1958", "1962", "1967", "1969"),
                                            3);
        Question question3 = new Question("What is the house number of the Simpsons ?",
                                            Arrays.asList("42", "101", "666", "742"),
                                            3);

        // Return QuestionBank
        return new QuestionBank(Arrays.asList(question1, question2, question3));
    }

/* Replace default text by question text */
    private void displayQuestion(final Question question) {
        mQuestionText.setText(question.getQuestion());
        mAnswer1.setText(question.getChoicelist().get(0));
        mAnswer2.setText(question.getChoicelist().get(1));
        mAnswer3.setText(question.getChoicelist().get(2));
        mAnswer4.setText(question.getChoicelist().get(3));
    }

/* Check user answer and show toast depending on correctness */
    @Override
    public void onClick(View v) {
        int responseIndex = (int) v.getTag();

        if (responseIndex == mCurrentQuestion.getAnswerIndex()) {
            Toast.makeText(this, "Correct !", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Nice try !", Toast.LENGTH_SHORT).show();
        }
    }
}
