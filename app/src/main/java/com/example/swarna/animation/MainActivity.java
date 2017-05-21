package com.example.swarna.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView textView,textView1;
    private ImageView imageView,imageView1;
    private Button button,button1;
    private Animation animFadein,animFadeinn,animFadeout,animFadeoutt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.txt1);
        animFadein = AnimationUtils.loadAnimation(this, R.anim.fadein);
        textView.startAnimation(animFadein);
        imageView = (ImageView) findViewById(R.id.img1);
        animFadeinn = AnimationUtils.loadAnimation(this, R.anim.fadein);
        imageView.startAnimation(animFadeinn);
        button = (Button)findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.startAnimation(animFadein);
                imageView.startAnimation(animFadeinn);
            }
        });
        textView1 = (TextView) findViewById(R.id.txt2);
        animFadeout = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        textView1.startAnimation(animFadeout);
        imageView1 = (ImageView) findViewById(R.id.img2);
        animFadeoutt = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        imageView1.startAnimation(animFadeoutt);
        button1 = (Button)findViewById(R.id.btn2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.startAnimation(animFadeout);
                imageView1.startAnimation(animFadeoutt);
            }
        });
    }
}
