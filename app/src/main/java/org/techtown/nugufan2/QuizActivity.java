package org.techtown.nugufan2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {
    ImageView gray1, gray2, gray3, gray4, gray5, purple1, purple2, purple3, purple4, purple5;
    private Timer timer;
    private TimerTask tt;
    int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        gray1 = (ImageView) findViewById(R.id.gray1);
        purple1 = (ImageView) findViewById(R.id.purple1);
        gray2 = (ImageView) findViewById(R.id.gray2);
        purple2 = (ImageView) findViewById(R.id.purple2);
        gray3 = (ImageView) findViewById(R.id.gray3);
        purple3 = (ImageView) findViewById(R.id.purple3);
        gray4 = (ImageView) findViewById(R.id.gray4);
        purple4 = (ImageView) findViewById(R.id.purple4);
        gray5 = (ImageView) findViewById(R.id.gray5);
        purple5 = (ImageView) findViewById(R.id.purple5);
        timer = new Timer();
        tt = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {

                    public void run() {
                        n++;
                        if(n==1) purple5.setVisibility(View.INVISIBLE);
                        else if(n==2) purple4.setVisibility(View.INVISIBLE);
                        else if(n==3) purple3.setVisibility(View.INVISIBLE);
                        else if(n==4) purple2.setVisibility(View.INVISIBLE);
                        else if(n==5) purple1.setVisibility(View.INVISIBLE);
                        else timer.cancel();
                    }

                });
            }
        };

        timer.schedule(tt, 1000, 1000);


    }
}
