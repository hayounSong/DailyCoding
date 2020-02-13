package com.cookandroid.daily_coding;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;

import static com.cookandroid.daily_coding.MainActivity.leveltest_correct;
import static com.cookandroid.daily_coding.MainActivity.type;

public class ResultActivity extends AppCompatActivity {
    PieChart pieChart;
    public TextView text_weakness;

    @Override
    protected void onCreate(Bundle saveInstanceState){

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_result);

        int wrong=0,temp=0;
        text_weakness = (TextView) findViewById(R.id.text_weakness);
        ImageButton btn_return = (ImageButton) findViewById(R.id.btn_return);
        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        int sum = 0;
        for(int i=0; i<6; i++){
            sum += type[i];
        }
        for (int i=0; i<6; i++) {
            if (type[i] > temp) {
                wrong = i;
                temp = type[i];
            }
        }
        if (sum == 0) {
            wrong = 6;
        }
        pieChart = (PieChart)findViewById(R.id.piechart);

        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,5,5,5);

        pieChart.setDragDecelerationFrictionCoef(0.95f);

        pieChart.setDrawHoleEnabled(false);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.setTransparentCircleRadius(61f);

        ArrayList<PieEntry> yValues = new ArrayList<PieEntry>();

        if (wrong==0){
            text_weakness.setText("당신이 취약한 부분은 변수 파트 입니다.");
        }
        else if(wrong ==1){
            text_weakness.setText("당신이 취약한 부분은 배열 파트 입니다.");
        }
        else if(wrong ==2){
            text_weakness.setText("당신이 취약한 부분은 상속 파트 입니다.");
        }
        else if(wrong ==3){
            text_weakness.setText("당신이 취약한 부분은 반복문 파트 입니다.");
        }
        else if(wrong ==4){
            text_weakness.setText("당신이 취약한 부분은 조건문 파트 입니다.");
        }
        else if(wrong ==5){
            text_weakness.setText("당신이 취약한 부분은 문자형 파트 입니다.");
        }
        else if (wrong==6){
            text_weakness.setText("오 코딩 천재시군요~! 다 맞았습니다!");
        }


        yValues.add(new PieEntry(leveltest_correct,"정답"));
        yValues.add(new PieEntry(10-leveltest_correct,"오답"));

        pieChart.animateY(1000, Easing.EasingOption.EaseInOutCubic); //애니메이션

        PieDataSet dataSet = new PieDataSet(yValues,"");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);

        PieData data = new PieData((dataSet));
        data.setValueTextSize(20f);
        data.setValueTextColor(Color.WHITE);

        pieChart.setData(data);

    }
}