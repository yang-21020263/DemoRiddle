package sg.edu.rp.c346.id21020263.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    //
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Log.d("AnswerActivity1", "onCreate() called.");
        //
        tvAnswer = findViewById(R.id.ans1);
        // tvAnswer.setText("In Second Activity");

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        if (questionsSelected.equalsIgnoreCase("Q1")) {
            tvAnswer.setText(questionsSelected + " answer is: Queue");
        } else if (questionsSelected.equalsIgnoreCase("Q2")) {
            tvAnswer.setText(questionsSelected + " answer is: Gone");
        }


    }
    @Override
    protected void onStart() {
        Log.d("AnswerActivity1", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("AnswerActivity1", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("AnswerActivity1", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("AnswerActivity1", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity1", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("AnswerActivity1", "onRestart() called.");
        super.onRestart();
    }

}