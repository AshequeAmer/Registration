package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,pass,number,email,address;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.nameID);
        pass=findViewById(R.id.PasswordID);
        number=findViewById(R.id.numberID);
        email=findViewById(R.id.EmailID);
        address=findViewById(R.id.addressID);
        register=findViewById(R.id.saveDataButton);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
            }
        });
    }
    public  void save(){
        String Name=name.getText().toString();
        String Password=pass.getText().toString();
        String Number=number.getText().toString();
        String Email=email.getText().toString();
        String Address=address.getText().toString();

        if( Name.isEmpty()){
            name.setError("name isn't valid");
        }
        if( Password.isEmpty()){
            pass.setError("password isn't valid");
        }
        if( Number.isEmpty()){
            number.setError("number isn't valid");
        }
        if( Email.isEmpty()){
            email.setError("email isn't valid");
        }
        if( Address.isEmpty()){
            address.setError("address isn't valid");
        }

        Intent intent=new Intent(MainActivity.this,Profile.class);
        intent.putExtra("textView1",Name);
        intent.putExtra("textView3",Number);
        intent.putExtra("textView4",Email);
        intent.putExtra("textView5",Address);
        startActivity(intent);

    }

}
