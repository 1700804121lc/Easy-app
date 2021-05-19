package com.example.test111;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;


public class StudyActivity extends AppCompatActivity {

    //声明控件
    private RadioGroup mRG1;
    private CheckBox mCB1;
    private CheckBox mCB2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        //找到控件
        mRG1 =findViewById(R.id.rg_1);
        mCB1 = findViewById(R.id.cb_1);
        mCB2 = findViewById(R.id.cb_2);

        //点击事件
        mRG1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                Toast.makeText(StudyActivity.this,radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        //点击事件
        mCB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(StudyActivity.this,isChecked?"选中":"未选中",Toast.LENGTH_SHORT).show();
            }
        });



    }
}