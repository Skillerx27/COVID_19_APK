package com.labawsrh.aws.COVID19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity13 extends AppCompatActivity {
    private long backPressedTime;
    private Toast backToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
    }


    public void Test(View view) {

        Update.numbers.clear();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }

    public void info(View view) {

        Update.numbers.clear();
        Intent intent = new Intent(this, IntroActivity.class);
        startActivity(intent);



    }

    public void contact(View view) {

        Update.numbers.clear();
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);


    }

    public void webpage(View view) {

        Update.numbers.clear();
        Intent intent = new Intent(this, MainActivity12.class);
        startActivity(intent);


    }

    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

}
