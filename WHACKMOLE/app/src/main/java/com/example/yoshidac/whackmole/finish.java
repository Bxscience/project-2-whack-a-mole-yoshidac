package com.example.yoshidac.whackmole;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class finish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        Intent intent = getIntent();
        String message = intent.getStringExtra(twothree.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView);
        textView.setText("YOUR SCORE WAS " + message);
    }

    public void startstart(View view){
        Intent intents = new Intent(finish.this, start.class);
        startActivity(intents);
    }
}
