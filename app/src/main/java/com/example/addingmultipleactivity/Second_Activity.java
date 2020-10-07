package com.example.addingmultipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Second_Activity extends AppCompatActivity {


    public void goBack (View view) {
       // Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        //startActivity(intent);
        finish();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        Intent intent = getIntent();
       String name =intent.getStringExtra("name");
        Log.i("info","Hi "+name);
               Toast.makeText(this,"this is  "+name+"'s page", Toast.LENGTH_SHORT).show();

    }
}