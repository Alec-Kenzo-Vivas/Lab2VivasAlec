package com.example.lab2vivasalec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText c1 , c2, c3, c4, c5, c6, c7, c8, courseval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ICS115", "onCreate has executed");
        Intent i = new Intent(this, myService.class);
        startService(i);
        c1 = findViewById(R.id.course1);
        c2 = findViewById(R.id.course2);
        c3 = findViewById(R.id.course3);
        c4 = findViewById(R.id.course4);
        c5 = findViewById(R.id.course5);
        c6 = findViewById(R.id.course6);
        c7 = findViewById(R.id.course7);
        c8 = findViewById(R.id.course8);
        courseval = findViewById(R.id.coursevalidate);
    }

    public void saveData(View v){
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String courseA = c1.getText().toString();
        String courseB = c2.getText().toString();
        String courseC = c3.getText().toString();
        String courseD = c4.getText().toString();
        String courseE = c5.getText().toString();
        String courseF = c6.getText().toString();
        String courseG = c7.getText().toString();
        String courseH = c8.getText().toString();

        editor.putString("courseA", courseA);
        editor.putString("courseB", courseB);
        editor.putString("courseC", courseC);
        editor.putString("courseD", courseD);
        editor.putString("courseE", courseE);
        editor.putString("courseF", courseF);
        editor.putString("courseG", courseG);
        editor.putString("courseH", courseH);
        editor.commit();
        Toast.makeText(this, "Data has been Registered...", Toast.LENGTH_LONG).show();
    }



    public void display1(View v){
        Intent i = new Intent(this,validate.class);
        startActivity(i);

    }

}
