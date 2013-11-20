package com.example.intentapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
 
public class IntentApp extends Activity {
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_app);
 
        Button dersler=(Button) findViewById(R.id.button1);
 
        dersler.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // TODO Auto-generated method stub
 
                Intent i1 = new Intent(IntentApp.this,Courses.class);
                startActivity(i1);
 
            }
        });
     }
 
}
