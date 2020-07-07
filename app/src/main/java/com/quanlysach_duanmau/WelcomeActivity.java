package com.quanlysach_duanmau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Thread couldow = new Thread(){
          public void run(){
              try {
                  sleep(4000);
              }catch (Exception e){

              }finally {
                  Intent i = new Intent(WelcomeActivity.this, LoginActivity.class);
                  startActivity(i);
              }
          }
        };
        couldow.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
