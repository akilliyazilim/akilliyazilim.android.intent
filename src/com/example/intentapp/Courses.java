package com.example.intentapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
 
public class Courses extends Activity{
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses);
 
        Button java= (Button) findViewById(R.id.button1);
        Button android=(Button) findViewById(R.id.button2);
 
    }
 
}