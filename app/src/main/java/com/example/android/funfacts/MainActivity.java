package com.example.android.funfacts;

import android.graphics.Color;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // declaring variables

   private TextView factTextView;
   private Button showFactButtion;
   private FunFacts fact = new FunFacts();
   private RelativeLayout rl;
   private ColorsForFun colorsForFun = new ColorsForFun();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assign views from layout files to the corresponding values
        factTextView = findViewById(R.id.funfactstextview);
        showFactButtion = findViewById(R.id.showfunfactsbutton);
        rl = (RelativeLayout) findViewById(R.id.layout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // button was clicked so update with new facts
                // randomly select a fact

                //update screen with new fact
                int color = Color.parseColor(colorsForFun.getColor());
                factTextView.setText(fact.getFact());
                rl.setBackgroundColor(color);
                showFactButtion.setTextColor(color);
            }
        };

        showFactButtion.setOnClickListener(listener);
    }
}
