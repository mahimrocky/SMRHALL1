package com.msttech.smrhall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    Button submitRegButton;
    EditText usernameReg, passwordReg, retypePasswordReg;

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        submitRegButton = (Button) findViewById(R.id.submitRegButton);
        usernameReg = (EditText) findViewById(R.id.usernameReg);
        passwordReg = (EditText) findViewById(R.id.passwordReg);
        retypePasswordReg = (EditText) findViewById(R.id.retypePasswordReg);

        databaseHelper = new DatabaseHelper(this);


        submitRegButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(usernameReg.getText().toString().trim().length()==0 || passwordReg.getText().toString().isEmpty() &&
                        retypePasswordReg.getText().toString().isEmpty()){
                    Toast.makeText(Registration.this, "Username and password must be entered", Toast.LENGTH_SHORT).show();
                }else{
                    if(passwordReg.getText().toString().equals(retypePasswordReg.getText().toString())){

                        boolean r = databaseHelper.insertData(usernameReg.getText().toString(), passwordReg.getText().toString());

                        if(r == true){
                            Toast.makeText(Registration.this,"Registration successfully",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Registration.this,FllorActivity.class));
                        }else{
                            Toast.makeText(Registration.this,"Registration failed",Toast.LENGTH_SHORT).show();
                        }

                    }else {

                        Toast.makeText(Registration.this, "Password dosenot match",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
