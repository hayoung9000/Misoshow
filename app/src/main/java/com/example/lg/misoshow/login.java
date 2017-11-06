package com.example.lg.misoshow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by LG on 2017-11-06.
 */

public class login extends AppCompatActivity {
    Button join,login;
    EditText id,pw;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        join=(Button)findViewById(R.id.join);
        join.setOnClickListener(joinHandler);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(loginHandler);
        id=(EditText)findViewById(R.id.edit_id);
        pw=(EditText)findViewById(R.id.edit_id);
    }
    View.OnClickListener joinHandler = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(login.this,join.class);
            startActivity(intent);
        }
    };
    View.OnClickListener loginHandler = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(login.this,MainActivity.class);//원래는 프레그먼트에 있는 메인 클래스로 가야함
            startActivity(intent);
        }
    };
}
