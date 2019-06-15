package com.amir_hamza_sabuz.animation1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivBart;
    ImageView ivHomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivBart = findViewById(R.id.ivBart);
        ivHomer = findViewById(R.id.ivHomer);
    }

    public void fade(View view){
        ivBart.animate().alpha(0f).setDuration(2000);
        ivHomer.animate().alpha(1f).setDuration(2000);


    }
}
