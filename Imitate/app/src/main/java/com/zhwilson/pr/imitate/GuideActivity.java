package com.zhwilson.pr.imitate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.zhwilson.pr.imitate.welcom.WelcomActivity;

/**
 * Created by pr on 2015/11/24.
 */
public class GuideActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_guide);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (WelcomActivity.shouldDisplay()){
                    Intent intent = new Intent(GuideActivity.this, WelcomActivity.class);
                    GuideActivity.this.startActivity(intent);
                    GuideActivity.this.finish();
                    return;
                }
                Intent intent = new Intent(GuideActivity.this, MainActivity.class);
                GuideActivity.this.startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                GuideActivity.this.finish();
            }
        }, 2000);
    }
}
