package com.anubhi.ck1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;



public class End extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

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
            Intent in=new Intent(End.this,AboutUs.class);
            startActivity(in);
            return true;
        }
        else if(id==R.id.rules){
            Intent in=new Intent(End.this,Rules.class);
            startActivity(in);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
