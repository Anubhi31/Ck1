package com.anubhi.ck1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends AppCompatActivity {
    private EditText password;
    private Button b;


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
                    String check;
                    String pattern = "pl@\\d\\d\\d\\d";
                    Pattern p = Pattern.compile(pattern);
                    check=password.getText().toString();
                    Matcher m = p.matcher(check);
                    if(m.find() && (check.charAt(3)=='1' || check.charAt(3)=='2' || check.charAt(3)=='3')&& check.length()==7){
                        SharedPreferences.Editor editor = settings.edit();
                        editor.putBoolean("firstRun",false);
                        editor.putInt("set",Integer.parseInt(check.substring(3,4)));
                        editor.putInt("userId",Integer.parseInt(check.substring(4)));
                        editor.apply();
                        Intent i=new Intent(Login.this,MainActivity.class);
                        Bundle b=new Bundle();
                        b.putInt("set",settings.getInt("set",Integer.parseInt(check.substring(3,4))));
                        b.putInt("userId",settings.getInt("userId",Integer.parseInt(check.substring(4))));
                        i.putExtras(b);
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
            Intent i=new Intent(Login.this,MainActivity.class);
            Bundle b=new Bundle();
            b.putInt("set",settings.getInt("set",0));
            b.putInt("userId",settings.getInt("userId",0));
            i.putExtras(b);
            startActivity(i);
            finish();
        }
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent in=new Intent(Login.this,AboutUs.class);
            startActivity(in);
            return true;
        }
        else if(id==R.id.rules){
            Intent in=new Intent(Login.this,Rules.class);
            startActivity(in);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    }

