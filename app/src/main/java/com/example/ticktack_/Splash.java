package com.example.ticktack_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        Thread td= new Thread(){
            public void run()
            {
                try {
                    sleep(3000);

                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }

                finally {
                    Intent it= new Intent(Splash.this, Login.class);
                    startActivity(it);
                }
            }
        }; td.start();

    }
}