package com.example.lg.misoshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    Button[] buttags=new Button[8];
    Button search;

    String sum="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0; i<buttags.length; i++){
            buttags[i]=(Button)findViewById(R.id.but1+i);
            buttags[i].setOnClickListener(butTagHandler);
        }
        search=(Button)findViewById(R.id.search_but);
        search.setOnClickListener(searchHandler);
        edit=(EditText)findViewById(R.id.edit);
    }
    View.OnClickListener butTagHandler = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,Search.class);
            Button but = (Button)view;
            sum+=but.getText();
            intent.putExtra("sum",sum);
            startActivity(intent);
            sum="";
        }
    };
    View.OnClickListener searchHandler = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            sum+=edit.getText();
           Intent intent = new Intent(MainActivity.this,Search.class);
           intent.putExtra("sum",sum);
           startActivity(intent);
            sum="";
        }
    };
}
