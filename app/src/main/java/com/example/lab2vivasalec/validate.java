package com.example.lab2vivasalec;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class validate extends AppCompatActivity {
    EditText c1 , c2, c3, c4, c5, c6, c7, c8, courseval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.validate_screen);
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
    public void validateCourse(View v){
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        String cor1 = sp.getString("courseA", null);
        String cor2 = sp.getString("courseB", null);
        String cor3 = sp.getString("courseC", null);
        String cor4 = sp.getString("courseD", null);
        String cor5 = sp.getString("courseE", null);
        String cor6 = sp.getString("courseF", null);
        String cor7 = sp.getString("courseG", null);
        String cor8 = sp.getString("courseH", null);



        if(cor1.equals(cor1)){
            Toast.makeText(this, "Course is Offered in UST...", Toast.LENGTH_LONG).show();
        }else if(cor2.equals(cor2)){
            Toast.makeText(this, "Course is Offered in UST...", Toast.LENGTH_LONG).show();
        }
        else if(cor3.equals(cor3)){
            Toast.makeText(this, "Course is Offered in UST...", Toast.LENGTH_LONG).show();
        }
        else if(cor4.equals(cor4)){
            Toast.makeText(this, "Course is Offered in UST...", Toast.LENGTH_LONG).show();
        }
        else if(cor5.equals(cor5)){
            Toast.makeText(this, "Course is Offered in UST...", Toast.LENGTH_LONG).show();
        }
        else if(cor6.equals(cor6)){
            Toast.makeText(this, "Course is Offered in UST...", Toast.LENGTH_LONG).show();
        }
        else if(cor7.equals(cor7)){
            Toast.makeText(this, "Course is Offered in UST...", Toast.LENGTH_LONG).show();
        }
        else if(cor8.equals(cor8)){
            Toast.makeText(this, "Course is Offered in UST...", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Course is NOT Offered in UST...", Toast.LENGTH_LONG).show();
        }
    }
    public void display2(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }
}
