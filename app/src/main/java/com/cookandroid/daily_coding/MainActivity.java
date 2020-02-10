package com.cookandroid.daily_coding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    static int type[] = new int[6];
    private ImageButton btn_dailycoding,btn_quiz,btn_leveltest,btn_studyvideo,btn_community,btn_check;
    public static float total_count=0, correct_count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_dailycoding = (ImageButton)findViewById(R.id.btn_dailycoding);
        btn_dailycoding =(ImageButton)findViewById(R.id.btn_dailycoding);
        btn_quiz =(ImageButton)findViewById(R.id.btn_quiz);
        btn_leveltest =(ImageButton)findViewById(R.id.btn_leveltest);
        btn_studyvideo =(ImageButton)findViewById(R.id.btn_studiovideo);
        btn_community =(ImageButton)findViewById(R.id.btn_community);
        btn_check = (ImageButton)findViewById(R.id.btn_check);


        btn_dailycoding.setOnClickListener(new View.OnClickListener() {
            int testsame[]=new int[20];

            @Override
            public void onClick(View view) {
                for (int i=0; i<3;i++) {
                    int n = (int) (Math.random() * 21) + 1;

                    if (testsame[n - 1] != 1) {
                        if (n == 1) {
                            Intent intent = new Intent(getApplicationContext(), quiz1.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 2) {
                            Intent intent = new Intent(getApplicationContext(), quiz2.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 3) {
                            Intent intent = new Intent(getApplicationContext(), quiz3.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 4) {
                            Intent intent = new Intent(getApplicationContext(), quiz4.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 5) {
                            Intent intent = new Intent(getApplicationContext(), quiz5.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 6) {
                            Intent intent = new Intent(getApplicationContext(), quiz6.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 7) {
                            Intent intent = new Intent(getApplicationContext(), quiz7.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 8) {
                            Intent intent = new Intent(getApplicationContext(), quiz8.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 9) {
                            Intent intent = new Intent(getApplicationContext(), quiz9.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 10) {
                            Intent intent = new Intent(getApplicationContext(), quiz10.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 11) {
                            Intent intent = new Intent(getApplicationContext(), quiz11.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 12) {
                            Intent intent = new Intent(getApplicationContext(), quiz12.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 13) {
                            Intent intent = new Intent(getApplicationContext(), quiz13.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 14) {
                            Intent intent = new Intent(getApplicationContext(), quiz14.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 15) {
                            Intent intent = new Intent(getApplicationContext(), quiz15.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 16) {
                            Intent intent = new Intent(getApplicationContext(), quiz16.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 17) {
                            Intent intent = new Intent(getApplicationContext(), quiz17.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 18) {
                            Intent intent = new Intent(getApplicationContext(), quiz18.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 19) {
                            Intent intent = new Intent(getApplicationContext(), quiz19.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 20) {
                            Intent intent = new Intent(getApplicationContext(), quiz20.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        }
                    }
                    else{
                        i=i-1;
                    }
                }
                return;
            }
        });
        btn_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), quiz_list.class);
                startActivity(intent);
            }
        });

        btn_leveltest.setOnClickListener(new View.OnClickListener() {
            int testsame[]=new int[20];
            int i=0;

            @Override
            public void onClick(View view) {
                for (i=0;i<6; i++){
                    type[i] = 0;
                }
                int count=0;
                for (i=0; i<10;i++) {
                    int n = (int) (Math.random() * 21) + 1;

                    count++;
                    if (testsame[n - 1] != 1) {
                        if (n == 1) {
                            Intent intent = new Intent(getApplicationContext(), quiz1.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 2) {
                            Intent intent = new Intent(getApplicationContext(), quiz2.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 3) {
                            Intent intent = new Intent(getApplicationContext(), quiz3.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 4) {
                            Intent intent = new Intent(getApplicationContext(), quiz4.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 5) {
                            Intent intent = new Intent(getApplicationContext(), quiz5.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 6) {
                            Intent intent = new Intent(getApplicationContext(), quiz6.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 7) {
                            Intent intent = new Intent(getApplicationContext(), quiz7.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 8) {
                            Intent intent = new Intent(getApplicationContext(), quiz8.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 9) {
                            Intent intent = new Intent(getApplicationContext(), quiz9.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 10) {
                            Intent intent = new Intent(getApplicationContext(), quiz10.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 11) {
                            Intent intent = new Intent(getApplicationContext(), quiz11.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 12) {
                            Intent intent = new Intent(getApplicationContext(), quiz12.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 13) {
                            Intent intent = new Intent(getApplicationContext(), quiz13.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 14) {
                            Intent intent = new Intent(getApplicationContext(), quiz14.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 15) {
                            Intent intent = new Intent(getApplicationContext(), quiz15.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 16) {
                            Intent intent = new Intent(getApplicationContext(), quiz16.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 17) {
                            Intent intent = new Intent(getApplicationContext(), quiz17.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 18) {
                            Intent intent = new Intent(getApplicationContext(), quiz18.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 19) {
                            Intent intent = new Intent(getApplicationContext(), quiz19.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        } else if (n == 20) {
                            Intent intent = new Intent(getApplicationContext(), quiz20.class);
                            startActivity(intent);
                            testsame[n - 1] = 1;
                        }
                    }
                    else{
                        i=i-1;
                    }
                }
                if(count==10){
                    Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                    startActivity(intent);

                }

            }
        });
        btn_community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), community_view.class);
                startActivity(intent);

            }
        });


        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (total_count==0){
                    Toast.makeText(MainActivity.this, "시험을 본 적이 없습니다..", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this, "정답률은 : " +correct_count/total_count*100+"% 입니다.", Toast.LENGTH_SHORT).show();
                }}
        });
    }
}
