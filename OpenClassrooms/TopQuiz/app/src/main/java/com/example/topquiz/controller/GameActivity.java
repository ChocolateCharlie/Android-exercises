package com.example.topquiz.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.topquiz.R;
import com.example.topquiz.model.Question;
import com.example.topquiz.model.QuestionBank;

import java.util.Arrays;



public class GameActivity extends AppCompatActivity {
    private QuestionBank mQuestionBank;
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
        mQuestionText = (TextView) findViewById(R.id.activity_game_question_text);
        mAnswer1 = (Button) findViewById(R.id.activity_game_answer1_btn);
        mAnswer2 = (Button) findViewById(R.id.activity_game_answer2_btn);
        mAnswer3 = (Button) findViewById(R.id.activity_game_answer3_btn);
        mAnswer4 = (Button) findViewById(R.id.activity_game_answer4_btn);
    }

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
}
