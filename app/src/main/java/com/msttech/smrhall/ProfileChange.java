package com.msttech.smrhall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class ProfileChange extends Activity {

    ImageButton home;
    Button submitButton;
    EditText usernameChange, passwordChange, retypePasswordChange;

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_profile_change);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        home = (ImageButton) findViewById(R.id.home);
        submitButton = (Button) findViewById(R.id.submitButton);
        usernameChange = (EditText) findViewById(R.id.usernameChange);
        passwordChange = (EditText) findViewById(R.id.passwordChange);
        retypePasswordChange = (EditText) findViewById(R.id.retypePasswordChange);

        databaseHelper = new DatabaseHelper(this);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileChange.this, FllorActivity.class));
            }
        });


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(usernameChange.getText().toString().trim().length()==0 || passwordChange.getText().toString().isEmpty() &&
                        retypePasswordChange.getText().toString().isEmpty()){
                    Toast.makeText(ProfileChange.this,"Username and password must be entered", Toast.LENGTH_SHORT).show();
                }else{
                    if(passwordChange.getText().toString().equals(retypePasswordChange.getText().toString())){

                        boolean isUpdated = databaseHelper.updateData("1", usernameChange.getText().toString(),
                                passwordChange.getText().toString());
                        if(isUpdated == true){
                            Toast.makeText(ProfileChange.this,"Changed successfully",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(ProfileChange.this,FllorActivity.class));
                        }else{
                            Toast.makeText(ProfileChange.this,"Failed",Toast.LENGTH_SHORT).show();
                        }

                    }else {

                        Toast.makeText(ProfileChange.this, "Password dosenot match",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


    }

}
