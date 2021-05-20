package com.nurayim.cat_intent_practice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class AboutActivity  extends Activity {
    Button button2;
    Button buttonToThirdActivity;
    //Значение по умолчанию
    String user ="Первый";
    String gift = "Второй";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        user = getIntent().getExtras().getString("username");
        gift = getIntent().getExtras().getString("gift");

        TextView infoTextView = findViewById(R.id.textViewInfo);
        infoTextView.setText(user + ", вам передали " + gift);





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
