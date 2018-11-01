package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = findViewById(R.id.button_ask);
        final ImageView result = findViewById(R.id.image_ball);

        final int[] predictions = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,
                            R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                result.setImageResource(predictions[random.nextInt(5)]);
            }
        });
    }
}
