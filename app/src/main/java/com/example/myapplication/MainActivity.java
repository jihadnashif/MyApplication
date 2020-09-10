package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private EditText first,last;
private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=findViewById(R.id.firstname);
        last=findViewById(R.id.lastname);
        btn=findViewById(R.id.bt);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==btn){
            Intent intent= new Intent(this,secActivity.class);
            intent.putExtra("firstName",first.getText().toString());
            intent.putExtra("lastName",last.getText().toString());
            startActivity(intent);


        }
    }
}