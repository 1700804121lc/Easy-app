package com.example.test111;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.test111.Adapter.PlayAdapter;

public class PlayActivity extends AppCompatActivity {

    //声明RecyclerView
    private RecyclerView mRVFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //找到控件
        mRVFinish = findViewById(R.id.rv_finish);

        //利用adapter显示item
        mRVFinish.setLayoutManager(new LinearLayoutManager(PlayActivity.this));
        //设置adapter
        mRVFinish.setAdapter(new PlayAdapter(PlayActivity.this, new PlayAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                //点击事件
                Toast.makeText(PlayActivity.this,"click..."+pos,Toast.LENGTH_SHORT).show();
            }
        }));


    }
}