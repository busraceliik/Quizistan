package com.example.recodedharran.quizistan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int point = 0;
    TextView quantityTextView;
    CheckBox checkBox;
    CheckBox checkBoxTwo;
    RadioGroup radioGroup;
    RadioGroup radioGroupTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quantityTextView = findViewById(R.id.quantityOfPoint);
        checkBox = findViewById(R.id.checkBoxThree);
        checkBoxTwo = findViewById(R.id.checkBoxFour);
        radioGroup = findViewById(R.id.radioGroupsOne);
        radioGroupTwo = findViewById(R.id.radioGroupsTwo);
        findViewById(R.id.submitButton).setOnClickListener(this);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton v, boolean isChecked) {
                if (isChecked) {
                    point=point+1;
                }
                else
                    point=point-1;
            }
        });

        checkBoxTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    point=point+1;
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb1 = findViewById(R.id.buttonOne);

                if (rb1.isChecked()) {
                    point=point+1;
                }
            }
        });

        radioGroupTwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {

               RadioButton rb1 = findViewById(R.id.buttonFive);

                if (rb1.isChecked()) {
                    point=point+1;
                }
                else
                    point=point+1-1;
            }
        });
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.submitButton:
                quantityTextView.setText(String.valueOf(point));
                break;

        }
    }
}