package com.example.lg.misoshow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by LG on 2017-11-05.
 */

public class Search extends AppCompatActivity{
    Button back;
    String sum;
    TextView text;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        Intent intent =getIntent();
        sum=intent.getStringExtra("sum");
        text=(TextView)findViewById(R.id.text);
        text.setText(sum);
        back=(Button)findViewById(R.id.but);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //밑에는 인기순 추천순처럼 나타나지만 sum을 찾아서 나타낸다.
    }

}
