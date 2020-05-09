package com.labawsrh.aws.COVID19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {
    TextView T1,T2,T3,T4,T5;
    private long backPressedTime;
    private Toast backToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        T1 = findViewById(R.id.DI1);
        T2 = findViewById(R.id.DI2);
        T3 = findViewById(R.id.DI3);
        T4 = findViewById(R.id.DI4);
        T5 = findViewById(R.id.DI5);
        int avg = (Update.numbers.get(1)+Update.numbers.get(2)+Update.numbers.get(3) +Update.numbers.get(4));
        System.out.println("HERE I AM "+avg);
        if(Update.numbers.get(0)>=65) {
            T1.setText("বয়স্ক নাগরিক");
        }
        else{
            T1.setText("শিশু বা, প্রবীণ নাগরিক");
        }
        if(Update.numbers.get(5)!=1&&Update.numbers.get(6)!=1&&avg<=1)
        {
            T2.setText("কভিড -১৯ এর জন্য আপনার ঝুঁকি এই মুহুর্তে খুব ন্যূনতম");
            T3.setText("আপনার লক্ষণগুলি অন্য অসুস্থতার সাথে সম্পর্কিত হতে পারে।");
            T4.setText("আপনার অবস্থার অবনতি ঘটলে বা দীর্ঘায়িত হয়ে থাকলে় অনুগ্রহ করে আপনার লক্ষণগুলি নিরীক্ষণ করুন এবং নিকটস্থ হাসপাতালের সাথে তাত্ক্ষণিক যোগাযোগ করুন");
        }
        else if(Update.numbers.get(5)!=1&&Update.numbers.get(6)!=1&&avg<=2)
        {
            T2.setText("আপনার লক্ষণগুলি অন্য অসুস্থতার সাথে সম্পর্কিত হতে পারে।");
            T3.setText("আপনার অবস্থার অবনতি ঘটলে বা দীর্ঘায়িত হয়ে থাকলে় অনুগ্রহ করে আপনার লক্ষণগুলি নিরীক্ষণ করুন এবং নিকটস্থ হাসপাতালের সাথে তাত্ক্ষণিক যোগাযোগ করুন");
        }
        else if(Update.numbers.get(5)!=1&&Update.numbers.get(6)!=1&&avg>=3){
            T2.setText("যেহেতু আপনার নিম্নলিখিত সমস্যাগুলি রয়েছে");
            T3.setText("জ্বর ৩৭.৫°C অথবা, ৯৮.৪°F থেকে বেশি\n" +
                    "শ্বাসকষ্টের সমস্যা\n" +
                    "কাশি\n" +
                    "গলা ব্যথা\n");
            T4.setText("যেহেতু আপনার নিম্নলিখিত সমস্যাগুলি রয়েছে");
            T5.setText("আপনার অবস্থার অবনতি ঘটলে বা দীর্ঘায়িত হয়ে থাকলে় অনুগ্রহ করে আপনার লক্ষণগুলি নিরীক্ষণ করুন এবং নিকটস্থ হাসপাতালের সাথে তাত্ক্ষণিক যোগাযোগ করুন");

        }
        else if(Update.numbers.get(5)==1&&avg==0||(Update.numbers.get(5)==1&&Update.numbers.get(6)==1&&avg==0)){
            T2.setText("কোন লক্ষণ নেই; নিজস্ব-কোয়ারান্টাইন আবশ্যক");
            T3.setText("যেহেতু আপনি সবেমাত্র উচ্চ ঝুঁকিপূর্ণ অঞ্চলগুলি থেকে ফিরে এসেছেন, অন্যের কাছ থেকে আক্রান্ত হওয়ার ঝুঁকি হ্রাস করতে আপনাকে ১৪ দিনের জন্য নিজস্ব-কোয়ারান্টাইনের মধ্য দিয়ে যেতে হবে।");
        }
        else if(Update.numbers.get(6)==1&&avg==0){
            T2.setText("কোনো লক্ষণ নেই, কিন্তু আপনি হয়তো কভিড-১৯ রোগীর সংস্পর্শে এসেছেন");
            T3.setText("যদিও আপনার থেকে কোনো লক্ষণ প্রকাশ পাই নি, সম্ভবত আপনি কভিড -১৯ রোগীর সংস্পর্শে এসেছেন।");
        }
        else if(Update.numbers.get(5)==1||Update.numbers.get(6)==1&&avg>=1){
            T2.setText("কভিড-১৯ এর সম্ভাব্য সন্দেহভাজন");
            T3.setText("আপনার দেয়া তথ্যের ভিত্তিতে, এটি অত্যন্ত সম্ভব যে আপনি কভিড-১৯ দ্বারা আক্রান্ত হতে পারেন।");
            T4.setText("বিশেষজ্ঞ ডাক্তারের সাথে সাক্ষাত অথবা, পার্শ্ববর্তী হাসপাতালে যোগাযোগ করার জন্য অনুরোধ করা হচ্ছে।");
            T5.setText("সতর্কীকরণঃ ০১৯৪৪-৩৩৩৪৪৪ নাম্বারে কল করুন। জাতীয় হেল্পডেস্কে কল করুন: ১৬২৬৩ বা, ৩৩৩");
        }




    }

    public void jumpintobegin(View view) {
        Update.numbers.clear();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }



    public void jumpintobegin3(View view) {
        Update.numbers.clear();
        Intent intent = new Intent(this, MainActivity13.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }




}
