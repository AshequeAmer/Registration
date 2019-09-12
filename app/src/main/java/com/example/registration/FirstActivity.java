package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void gotoNewActivity(View view) {
        Toast.makeText(FirstActivity.this, "Log In Successfully", Toast.LENGTH_SHORT).show();
    }

    public void gotoNewActivity1(View view) {
        Toast.makeText(FirstActivity.this, "Log In Successfully", Toast.LENGTH_SHORT).show();
    }

    public void gotoNewActivity2(View view) {
        Intent goTo = new Intent(FirstActivity.this, MainActivity.class);
        startActivity(goTo);
    }
}
