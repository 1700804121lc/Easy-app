package com.example.test111;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SlideActivity extends AppCompatActivity {
    //声明控件
    private ImageView mIvhead;
    private SlideMenu slideMenu;
    private Button mBtnStudy;
    private Button mBtnPlay;
    private Button mBtnExercise;
    private Button mBtnRead;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        //找到控件
        mIvhead = findViewById(R.id.iv_head);
        slideMenu = findViewById(R.id.slideMenu);
        mBtnStudy = findViewById(R.id.btn_main_1);
        mBtnPlay = findViewById(R.id.btn_main_2);
        mBtnExercise = findViewById(R.id.btn_main_3);
        mBtnRead = findViewById(R.id.btn_main_4);


        //实现侧滑的部分,点击+侧滑
        mIvhead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideMenu.switchMenu();
            }
        });
        setlistener();
    }

    private void setlistener(){
        OnClick onClick = new OnClick();

        //对每一个按钮进行setOnClicklistner
        mBtnStudy.setOnClickListener(onClick);
        mBtnPlay.setOnClickListener(onClick);
        mBtnExercise.setOnClickListener(onClick);
        mBtnRead.setOnClickListener(onClick);

    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch(v.getId()){
                case R.id.btn_main_1:
                    intent = new Intent(SlideActivity.this,StudyActivity.class);
                    break;
                case R.id.btn_main_2:
                    intent = new Intent(SlideActivity.this,PlayActivity.class);
                    break;
                case R.id.btn_main_3:
                    intent = new Intent(SlideActivity.this,ExerciseActivity.class);
                    break;
                case R.id.btn_main_4:
                    intent = new Intent(SlideActivity.this,ReadActivity.class);
                    break;

            }
            startActivity(intent);
        }
    }

}