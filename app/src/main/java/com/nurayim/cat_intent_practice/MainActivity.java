package com.nurayim.cat_intent_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText userEditText = findViewById(R.id.first_editText);
        EditText giftEditText = findViewById(R.id.second_editTex);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AboutActivity.class);
                intent.putExtra("username",userEditText.getText().toString());
                startActivity(intent);
                intent.putExtra("gift",giftEditText.getText().toString());
                startActivity(intent);
            }
        });
    }
    }








