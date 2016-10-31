package com.msttech.smrhall;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class DedicationActivity extends AppCompatActivity {

    TextView shamimName,shantoName,shamimDesignation,
            shantoDesignation, shamimJessore, shantoJessore,shamimStudentLegue, shantoStudentLegue,joyBangla2;
    ImageButton back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dedication);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        joyBangla2 = (TextView)findViewById(R.id.joyBanhla2);

        shamimName = (TextView)findViewById(R.id.shamimName);
        shantoName = (TextView)findViewById(R.id.shantoName);
        shamimDesignation= (TextView)findViewById(R.id.shamimDesignation);
        shantoDesignation= (TextView)findViewById(R.id.shantoDesignation);
        shamimJessore= (TextView)findViewById(R.id.shamimJessore);
        shantoJessore= (TextView)findViewById(R.id.shantoJessore);
        shamimStudentLegue= (TextView)findViewById(R.id.shamimStudentLegue);
        shantoStudentLegue= (TextView)findViewById(R.id.shantoStudentLegue);

        back = (ImageButton)findViewById(R.id.back1);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/solaimanLipi.ttf");

        shamimName.setTypeface(typeface);
        shamimDesignation.setTypeface(typeface);
        shamimJessore.setTypeface(typeface);
        shamimStudentLegue.setTypeface(typeface);

        shantoName.setTypeface(typeface);
        shantoDesignation.setTypeface(typeface);
        shantoJessore.setTypeface(typeface);
        shantoStudentLegue.setTypeface(typeface);

        joyBangla2.setTypeface(typeface);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DedicationActivity.this, FllorActivity.class));
            }
        });

    }

}
