package com.labawsrh.aws.COVID19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }



    public void jumpintobegin2(View view) {
        Update.numbers.clear();
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/groups/223323615409348"));
        startActivity(intent);


    }
    public void jumpintobegin3(View view) {
        Update.numbers.clear();
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/groups/164457684523558"));
        startActivity(intent);

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }



}
