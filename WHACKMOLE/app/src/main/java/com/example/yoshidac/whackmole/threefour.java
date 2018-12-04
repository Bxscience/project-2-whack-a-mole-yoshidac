package com.example.yoshidac.whackmole;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class threefour extends AppCompatActivity {

    TextView timeText = findViewById(R.id.textView);
    TextView scoreText = findViewById(R.id.textView2);
    int score = 0;

    ImageButton[] imageButtons = {findViewById(R.id.imageButton), findViewById(R.id.imageButton2), findViewById(R.id.imageButton3), findViewById(R.id.imageButton4), findViewById(R.id.imageButton5), findViewById(R.id.imageButton6), findViewById(R.id.imageButton7), findViewById(R.id.imageButton8), findViewById(R.id.imageButton9), findViewById(R.id.imageButton10), findViewById(R.id.imageButton11), findViewById(R.id.imageButton12)};

    public static final String EXTRA_MESSAGE = "com.example.WhackAMole.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twothree);

        new CountDownTimer(60000, 1000){

            public void onTick(long millisUntilFinished) {
                timeText.setText("TIME LEFT: " + millisUntilFinished / 1000);
                scoreText.setText("SCORE: " + score);

                for (ImageButton x:imageButtons){
                    if (Math.random() > .9){
                        setactive(x);
                    }
                    else setinactive(x);
                }
            }

            public void onFinish() {
                startfinish();
            }
        }.start();
    }

    private void startfinish(){
        Intent intent = new Intent(threefour.this, finish.class);
        intent.putExtra(EXTRA_MESSAGE, score);
        startActivity(intent);
    }

    private void setactive(ImageButton imageButton){
        imageButton.setImageResource(R.drawable.giantmole);
        imageButton.setTag("active");
    }

    private void setinactive(ImageButton imageButton){
        imageButton.setImageResource(R.drawable.hole);
        imageButton.setTag("inactive");
    }

    public void clickbutton(View view){
        ImageButton clicked = findViewById(view.getId());
        if(clicked.getTag() == "active"){
            setinactive(clicked);
            score++;
        }
    }
}
