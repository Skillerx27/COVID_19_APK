package com.labawsrh.aws.COVID19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }


    public void openActivity5Na(View view) {
        Update.numbers.add(0);
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
        finish();
    }

    public void openActivity5Yes(View view) {
        Update.numbers.add(1);
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }


}
