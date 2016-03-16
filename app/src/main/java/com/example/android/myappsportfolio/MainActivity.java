package com.example.android.myappsportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PrivateKey;
import java.text.NumberFormat;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void message1(View view) {
     Toast.makeText(getApplicationContext(), "This Button will launch SPOTIFY STREAMER App!", Toast.LENGTH_LONG).show();
    }
    public void message2(View view) {
        Toast.makeText(getApplicationContext(), "This Button will launch  Scores App!", Toast.LENGTH_SHORT).show();
    }
    public void message3(View view) {
        Toast.makeText(getApplicationContext(), "This Button will launch Library  App!", Toast.LENGTH_SHORT).show();
    }
    public void message4(View view) {
        Toast.makeText(getApplicationContext(), "This Button will launch Build it Bigger App!", Toast.LENGTH_SHORT).show();
    }
    public void message5(View view) {
        Toast.makeText(getApplicationContext(), "This Button will launch XYZ Reader App!", Toast.LENGTH_SHORT).show();
    }
    public void message6(View view) {
        Toast.makeText(getApplicationContext(), "This Button will launch Capstone : My own App!", Toast.LENGTH_SHORT).show();
    }
}

