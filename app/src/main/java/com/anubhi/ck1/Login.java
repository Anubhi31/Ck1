package com.anubhi.ck1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
EditText password;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        final SharedPreferences settings = getSharedPreferences("prefs",0);
        boolean firstRun = settings.getBoolean("firstRun",true);

        if(firstRun){
            setContentView(R.layout.activity_login);
            password=(EditText)findViewById(R.id.ptext);
            b=(Button)findViewById(R.id.login);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String check,pass="ck1101";
                    check=password.getText().toString();
                    if(check.equals(pass)){
                        SharedPreferences.Editor editor = settings.edit();
                        editor.putBoolean("firstRun",false);
                        editor.commit();
                        Intent i=new Intent(Login.this,MainActivity.class);
                        startActivity(i);
                        finish();


                    }
                    else
                    {
                        password.setError("Incorrect Password");
                        password.setText(null);
                    }
                }
            });



        }
        else{
            System.out.println(firstRun);
            Intent i=new Intent(Login.this,MainActivity.class);
            startActivity(i);
            finish();
        }
        }


    }

