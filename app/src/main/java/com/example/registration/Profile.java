package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    TextView text1,text3,text4,text5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        text1=findViewById(R.id.textView1);

        text3=findViewById(R.id.textView3);
        text4=findViewById(R.id.textView4);
        text5=findViewById(R.id.textView5);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String s1=bundle.getString("textView1","");

            String s3=bundle.getString("textView3","");
            String s4=bundle.getString("textView4","");
            String s5=bundle.getString("textView5","");

            text1.setText(s1);

            text3.setText(s3);
            text4.setText(s4);
            text5.setText(s5);
        }
    }
}
