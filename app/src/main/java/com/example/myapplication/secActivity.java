package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class secActivity extends AppCompatActivity {
private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        tv=findViewById(R.id.tvsec);
        Intent intent =getIntent();
        String fn=intent.getStringExtra("firstName");
        String ln=intent.getStringExtra("lastName");
        if (fn!=null&&ln!=null) {
            tv.setText(fn + " " + ln);
            Toast.makeText(this, "ya mr7ba", Toast.LENGTH_LONG).show();
        }

    }
}