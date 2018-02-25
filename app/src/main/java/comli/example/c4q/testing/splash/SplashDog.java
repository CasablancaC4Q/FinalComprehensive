package comli.example.c4q.testing.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import comli.example.c4q.testing.mainthings.LoginActivity;
import comli.example.c4q.testing.R;

public class SplashDog extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_dog);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashDog.this, LoginActivity.class);
                startActivity(intent);

            }
        }, SPLASH_TIME_OUT);
    }
}