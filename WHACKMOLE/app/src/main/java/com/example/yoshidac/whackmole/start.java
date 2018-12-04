package com.example.yoshidac.whackmole;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void starttwothree(View view) {
        Intent intent23 = new Intent(start.this, twothree.class);
        startActivity(intent23);
    }

    public void startthreefour(View view) {
        Intent intent34 = new Intent(start.this, threefour.class);
        startActivity(intent34);
    }

    public void startfourfive(View view) {
        Intent intent45 = new Intent(start.this, fourfive.class);
        startActivity(intent45);
    }
}
