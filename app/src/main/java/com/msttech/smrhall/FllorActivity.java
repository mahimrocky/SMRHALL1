package com.msttech.smrhall;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class FllorActivity extends Activity {

    ImageButton profile;
    Button floor1,floor2,floor3,floor4,floor5;
    Button dedication;

    TextView joyBangla;



    private Boolean exit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_fllor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        profile = (ImageButton) findViewById(R.id.profile);

        floor1 = (Button) findViewById(R.id.btn1);
        floor2 = (Button) findViewById(R.id.btn2);
        floor3 = (Button) findViewById(R.id.btn3);
        floor4 = (Button) findViewById(R.id.btn4);
        floor5 = (Button) findViewById(R.id.btn5);

        dedication = (Button)findViewById(R.id.btn6);


        joyBangla = (TextView)findViewById(R.id.joyBangla);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/solaimanLipi.ttf");
        joyBangla.setTypeface(typeface);
        joyBangla.setSelected(true);

        floor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FllorActivity.this, Floor1Activity.class);
                startActivity(intent);
            }
        });
        floor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FllorActivity.this,Floor2Activity.class);
                startActivity(intent);
            }
        });
        floor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FllorActivity.this,Floor3Activity.class);
                startActivity(intent);
            }
        });
        floor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FllorActivity.this,Floor4Activity.class);
                startActivity(intent);
            }
        });
        floor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FllorActivity.this, Floor5Activity.class);
                startActivity(intent);
            }
        });


        dedication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FllorActivity.this, DedicationActivity.class));
            }
        });


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(FllorActivity.this, ProfileChange.class));
            }
        });

    }


    @Override
    public void onBackPressed() {
        if (exit) {
            Intent intent = new Intent(FllorActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("EXIT", true);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }


}
