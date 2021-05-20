package com.nurayim.cat_intent_practice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class AboutActivity  extends Activity {
    Button button2;
    Button buttonToThirdActivity;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        button2 = findViewById(R.id.btn_back);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Intent intent = new Intent(AboutActivity.this,MainActivity.class);
                  startActivity(intent);
            }
        });

        buttonToThirdActivity = findViewById(R.id.btn_to_third);
        buttonToThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });



    }
}
