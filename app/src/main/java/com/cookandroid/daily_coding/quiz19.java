package com.cookandroid.daily_coding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static com.cookandroid.daily_coding.MainActivity.leveltest_correct;
import static com.cookandroid.daily_coding.MainActivity.total_count;
import static com.cookandroid.daily_coding.MainActivity.correct_count;
import static com.cookandroid.daily_coding.MainActivity.type;

import androidx.appcompat.app.AppCompatActivity;

public class quiz19 extends AppCompatActivity {

    private ImageButton btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz19);
        total_count+=1;

        btn1 =(ImageButton)findViewById(R.id.answer19_1);
        btn2 =(ImageButton)findViewById(R.id.answer19_2);
        btn3 =(ImageButton)findViewById(R.id.answer19_3);
        btn4 =(ImageButton)findViewById(R.id.answer19_4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type[2]++;
                Toast.makeText(quiz19.this, "땡 틀렸습니다...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),answer19.class);
                startActivity(intent);
                finish();
                return;
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type[2]++;
                Toast.makeText(quiz19.this, "땡 틀렸습니다...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),answer19.class);
                startActivity(intent);
                finish();
                return;
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type[2]++;
                Toast.makeText(quiz19.this, "땡 틀렸습니다...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),answer19.class);
                startActivity(intent);
                finish();
                return;
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(quiz19.this, "정답입니다~!", Toast.LENGTH_SHORT).show();
                correct_count+=1;
                leveltest_correct+=1;
                finish();
                return;
            }
        });
    }
}
