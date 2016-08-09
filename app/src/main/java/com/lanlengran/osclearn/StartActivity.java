package com.lanlengran.osclearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

public class StartActivity extends AppCompatActivity implements Animation.AnimationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view=View.inflate(this,R.layout.activity_start,null);
        setContentView(view);

        Animation animation=new AlphaAnimation(0,1f);
        animation.setDuration(1000);
        view.startAnimation(animation);
        animation.setAnimationListener(this);

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent it=new Intent(this,MainActivity.class);
        startActivity(it);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
