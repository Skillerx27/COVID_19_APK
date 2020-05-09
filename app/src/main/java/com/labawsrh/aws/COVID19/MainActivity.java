package com.labawsrh.aws.COVID19;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private long backPressedTime;
    private Toast backToast;
    EditText UserAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void openActivity2(View view){
        UserAge = findViewById(R.id.TextAge);
        boolean error = false;
        int age;
        String userName = UserAge.getText().toString().trim();

        if(userName.isEmpty()){
            UserAge.setError("বয়সের ক্ষেত্রটি খালি");
            error = true;
        }

        else {
            for(int i=0; i<userName.length(); i++)
            {
                int k = userName.charAt(i);
                if(k<48||k>57)
                {
                    error = true;
                    break;
                }
            }
        }
        if(error){
            Toast.makeText(this, "তথ্য সঠিকভাবে স্থাপন করুন", Toast.LENGTH_SHORT).show();
        }else{
            age = Integer.parseInt(UserAge.getText().toString());
            Update.numbers.add(age);
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);
            finish();
        }

    }



    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }




}
