package com.example.roqa7hmed.design;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

public class MyQuestion2 extends AppCompatActivity {


        private TextView textViewQuestion;
        private TextView textViewScore;
        private TextView textViewQuestionCount;
        private TextView textViewCountDown;
        private RadioGroup rbGroup;
        private RadioButton rb1;
        private RadioButton rb2;
        private RadioButton rb3;
        private Button buttonConfirmNext;
        private ImageButton BackArrow;
        private ImageButton Myhome;

        private ColorStateList textColorDefaultRb;

        private List<Question> questionList;

        private int questionCounter;
        private int questionCountTotal;
        private Question currentQuestion;

        private int score;
        private boolean answered;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_my_question);

            textViewQuestion = findViewById(R.id.text_view_question);
            textViewScore = findViewById(R.id.text_view_score);
            textViewQuestionCount = findViewById(R.id.text_view_question_count);
            // textViewCountDown = findViewById(R.id.text_view_countdown);
            rbGroup = findViewById(R.id.radio_group);
            rb1 = findViewById(R.id.radio_button1);
            rb2 = findViewById(R.id.radio_button2);
            rb3 = findViewById(R.id.radio_button3);
            buttonConfirmNext = findViewById(R.id.button_confirm_next);

            textColorDefaultRb = rb1.getTextColors();

            DBHelper dbHelper = new DBHelper(this);
            questionList = dbHelper.getAllQuestions2();

            questionCountTotal = questionList.size();
            questionList = dbHelper.getAllQuestions2();


            Collections.shuffle(questionList);


            showNextQuestion();

            buttonConfirmNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!answered) {
                        if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked()) {
                            checkAnswer();
                        } else {
                            Toast.makeText(MyQuestion2.this, "Please select an answer", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        showNextQuestion();
                    }
                }
            });
            BackArrow=findViewById(R.id.backbutton);
            BackArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent=new Intent(MyQuestion2.this,Circle.class);
                    startActivity(intent);
                }
            });
            Myhome=findViewById(R.id.myhome);
            Myhome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent=new Intent(MyQuestion2.this,MainActivity.class);
                    startActivity(intent);
                }
            });

        }

        //part5
        //get Question from database and options
        private void showNextQuestion() {
            rb1.setTextColor(textColorDefaultRb);
            rb2.setTextColor(textColorDefaultRb);
            rb3.setTextColor(textColorDefaultRb);
            rbGroup.clearCheck();

            if (questionCounter < questionCountTotal) {
                currentQuestion = questionList.get(questionCounter);

                textViewQuestion.setText(currentQuestion.getQuestion());
                rb1.setText(currentQuestion.getOption1());
                rb2.setText(currentQuestion.getOption2());
                rb3.setText(currentQuestion.getOption3());

                questionCounter++;
                textViewQuestionCount.setText("Question: " + questionCounter + "/" + questionCountTotal);
                answered = false;
                buttonConfirmNext.setText("Confirm");
            } else {
                finishQuiz();
            }
        }
        //check answer is true of false
        private void checkAnswer() {
            answered = true;

            RadioButton rbSelected = findViewById(rbGroup.getCheckedRadioButtonId());
            int answerNr = rbGroup.indexOfChild(rbSelected) + 1;
            ImageView I1 = (ImageView)findViewById(R.id.star1);
            ImageView I2 = (ImageView)findViewById(R.id.star2);
            ImageView I3 = (ImageView)findViewById(R.id.star3);
            ImageView I4 = (ImageView)findViewById(R.id.star4);
            ImageView I5 = (ImageView)findViewById(R.id.star5);
            //if answer is correct will into here
            if (answerNr == currentQuestion.getAnswerNr()) {
                score++;
                textViewScore.setText("Score: " + score);
                if(questionCounter == 1)
                    ((TransitionDrawable)I1.getDrawable()).startTransition(20);
                else if(questionCounter == 2)
                    ((TransitionDrawable)I2.getDrawable()).startTransition(20);
                else if(questionCounter == 3)
                    ((TransitionDrawable)I3.getDrawable()).startTransition(20);
                if(questionCounter == 4)
                    ((TransitionDrawable)I4.getDrawable()).startTransition(20);
                if(questionCounter == 5)
                    ((TransitionDrawable)I5.getDrawable()).startTransition(20);
            }

            //if answer is false will call this method
            showSolution();
        }

        //change color of options between (Green & Red)
        //if answer is false will use this method
        private void showSolution() {
            rb1.setTextColor(Color.RED);
            rb2.setTextColor(Color.RED);
            rb3.setTextColor(Color.RED);

            switch (currentQuestion.getAnswerNr()) {
                case 1:
                    rb1.setTextColor(Color.GREEN);
                    textViewQuestion.setText("Answer 1 is correct");
                    break;
                case 2:
                    rb2.setTextColor(Color.GREEN);
                    textViewQuestion.setText("Answer 2 is correct");
                    break;
                case 3:
                    rb3.setTextColor(Color.GREEN);
                    textViewQuestion.setText("Answer 3 is correct");
                    break;
            }

            if (questionCounter < questionCountTotal) {
                buttonConfirmNext.setText("Next");
            } else {
                buttonConfirmNext.setText("Finish");
            }
        }

        private void finishQuiz() {
            finish();
        }
}
